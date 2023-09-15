package BinaryTree;

public class Lca {
    static class Node{
       int data;
       Node left;
       Node right;
       Node(int data){
        this.data = data;
        this.left= null;
        this.right=null;
       }
    }
    public static Node lca(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }

        Node leftlca=lca(root.left, n1, n2);
        Node rightlca = lca(root.right,n1,n2);

        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return rightlca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }

        int leftDistance = lcaDist(root.left, n);
        int rightDistance = lcaDist(root.right,n);

        if(leftDistance == -1 && rightDistance ==-1){
            return -1;
        }else if(leftDistance == -1){
            return rightDistance+1;
        }else{
            return leftDistance+1;
        }
    }
    public static int minDis(Node root,int n1,int n2){
        Node la = lca(root, n1, n2);
        int dis1 = lcaDist(la,n1);
        int dis2 = lcaDist(la,n2);

        return dis1+dis2;
    }
    public static void main(String args[]){
        Node n = new Node(0);
        n.left = new Node(1);
        n.right = new Node(3);
        System.out.println(minDis(n, 1,3));
    }
}
