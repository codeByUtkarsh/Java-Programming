import java.util.*;
public class bubblesort {
    public static void bubbleSort(int barr[]){
        for(int turn=0; turn<barr.length-1;turn++){
            for(int i=0;i<barr.length-1-turn;i++){
                if(barr[i]>barr[i+1]){
                    //swap the numbers
                    int temp = barr[i];
                    barr[i]= barr[i+1];
                    barr[i+1] = temp;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for( int i=0; i<arr.length;i++){
             System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){

        int sort[] = {5,4,1,3,2};
        bubbleSort(sort);
        printarr(sort);
    }
    
}
