package Queues;

import java.util.Stack;

public class Stack2 {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            
            int el = s1.pop();
            return el;
        }

        //peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int el=s1.peek();
            return el;

        }
    }
    public static void main(String args[]){
        Queue n = new Queue();
        n.add(1);
        n.add(2);
        n.add(3);
        while(!n.isEmpty()){
            System.out.println(n.peek());
            n.remove();
        }
    }
    
}
