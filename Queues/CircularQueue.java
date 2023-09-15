package Queues;

public class CircularQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int n){
        arr = new int[n];
        size = n;
        front = -1;
        rear = -1;
        }
        public static boolean isEmpty(){
        return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //Add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");;
                return;
            }
            if(front == -1){
                front=0;
            }
            rear +=1;
            arr[rear] = data;
        }

        //remove
        
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front  = (front+1)%size;
            }
            return result ;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            return result;

        }
    }
    public static void main(String args[]){
        Queue nq = new Queue(4);
        nq.add(1);
        nq.add(2);
        nq.add(3);
        nq.add(4);
        nq.add(5);
        while(!nq.isEmpty()){
            System.out.println(nq.peek());
            nq.remove();
        }
    }
    
}
