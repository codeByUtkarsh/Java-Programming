package Linked_List;

public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //Step 1 Create a node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //newNode's next is pointing towards head
        newNode.next=head;

        //head is now newNode
        head = newNode;
    }
    public void addLast(int data){
        //create a node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //assign tail.next = newNode;
        tail.next = newNode;

        tail = newNode;
    }
    public void add(int idx,int data){
        
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;


    }

    //REMOVE FIRST
    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head= head.next;
        size--;
        return val;
    }

    //REMOVE LAST
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next =null;
        tail = prev;
        size--;
        return val;
    }
    public void print(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("null");
            return;
        }
    }
    public int search(int key){
        int i=0;
            Node temp = head;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                i++;
                temp=temp.next;
            }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        else if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);

        if(idx== -1){
            return -1;
        }
        return idx+1;
    }

    //Reverse a Linked List
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next =curr.next;
            curr.next =prev;
            prev = curr;
            curr =next;
        }
        head =prev;
    }

    //Delete nth node from end
    public void deleteNth(int n){
        int sz=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head= head.next;
            return;
        }
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next =prev.next.next;
        return;

    }

    //Find a mid of linked list
    //Slow -Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2
        }
        return slow;   //middle node
    }

    //Checking if a ll is palindrome or not
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }

        //Step1 - Find a mid
        Node mid = findMid(head);

        //Step 2 -> Reverse a 2nd half of LL
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right =prev;
        Node left = head;
        //Check left half and right half of linked list

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;


    }

    //isCycle
    public static boolean isCycle(){
        Node slow=head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                return true;
            }
        }
        return false;
    }


    //Remove cycle from Linked list
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        
        //Finding the meeting point

        slow = head;
        Node prev = null;
        while(fast!=slow){
            prev = fast;
            slow = slow.next;       
            fast = fast.next;
        }

        //remove cycle;
        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1,Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!= null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }


    //Merge Sort on Linked list
    private Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }
        
        //Find a mid

        Node mid = getMid(head);

        //left and right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
       

    }

    //Zig zag linked list
    public void zigZag(){

        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node LH = head;
        Node RH = prev;
        Node nextL ,nextR;
        while(LH!=null && RH!=null){
            

            //zigzag
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            //Update
            RH = nextR;
            LH = nextL;
        }


    }

    //RECURSIVE SEARCH
    public int recSearch(int key){
        return helper(head,key);
    }
            
        
    public static void main(String args[]){
    Linkedlist ll = new Linkedlist();
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(2);
    // ll.addLast(1);
    // ll.add(2, 5);
    // ll.print();
    // ll.removeFirst();
    // ll.print();
    // ll.removeLast();
    // ll.print();
    // System.out.println(ll.search(3));
    // System.out.println(ll.recSearch(5));
    // System.out.println(ll.recSearch(10));
    // ll.reverse();
    // ll.print();
    // ll.deleteNth(3);
    // ll.print();
    // System.out.println(ll.checkPalindrome());
    // head = new Node(1);
    // Node temp = new Node(2);
    // head.next = temp;
    // head.next.next = new Node(3);
    // head.next.next.next = temp;
    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    ll.print();
    ll.zigZag();
    // ll.head = ll.mergeSort(ll.head);
    ll.print();
    

    }

}

