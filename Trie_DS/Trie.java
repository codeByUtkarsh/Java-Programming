package Trie_DS;

public class Trie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root = new Node();

    //insertion in trie

    public static void insert(String word){
        Node curr = root;
        for(int level =0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    //searching in trie

    public static boolean search(String key){
        Node curr = root;
        for(int i =0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow;
    }
    public static void main(String args[]){
        String word[] ={"the","a","their","there","thee"};

        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(search("th"));
        System.out.println(search("the"));
    }
}
