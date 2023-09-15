package Heaps;

import java.util.ArrayList;

public class Insert {

    static class Heaps{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x= par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int mid = i;

            if(left < arr.size() && arr.get(mid)> arr.get(left)){
                mid = left;
            }
            if(right < arr.size() && arr.get(mid)>arr.get(right)){
                mid = right;
            }

            if(mid!=i){
                
                //Now swap with min node
                int temp = arr.get(i);
                arr.set(i,arr.get(mid));
                arr.set(mid, temp);
                heapify(mid);
            }
        }

        public int remove(){
            int data = arr.get(0);

            //Swap 1st and last element of a node
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //Delete a last node
            arr.remove(arr.size()-1);

            //Heapify process;
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
        
    }

    public static void main(String args[]){
        Heaps minHeap = new Heaps();
        minHeap.add(2);
        minHeap.add(3);
        minHeap.add(4);
        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(1);
        
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.peek());
            minHeap.remove();
        }

        
    }
}
