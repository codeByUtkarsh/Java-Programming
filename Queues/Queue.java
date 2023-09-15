package Queues;

public class Queue {
    static class Queuee{
        static int arr[];
        static int size;
        static int rear;
        Queuee(int n){
            arr = new int[n];
            size =n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        //Add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear+=1;
            arr[rear] = data;
        }

        //Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear = rear -1;
            return front;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];
            return front;
        }
    }
    public static void main(String args[]){
        Queuee newQueue = new Queuee(5);
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(4);
        newQueue.add(5);
        while(!newQueue.isEmpty()){
            System.out.println(newQueue.peek());
            newQueue.remove();
        }
    }
}
