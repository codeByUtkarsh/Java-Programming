package Queues;

public class LLQueue {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return (head == null && tail == null );
        }
        
        //add
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=tail= newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }

            //remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                int front = head.data;
                if(head==tail){
                    head = tail = null;
                }else{
                    head = head.next;
                }
                
                return front;
            }
        }

            //peek
        public static int peek(){
            if(isEmpty()){ 
                System.out.println("Queue is empty");
                return -1;
            }
            int el = head.data;
            return el;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
