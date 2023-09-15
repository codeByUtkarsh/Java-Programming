import java.util.*;
public class sorting_inbuilt {
    public static void printarr(Integer arr[]){
        for(Integer i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[]={5,2,9,7,6,8};
        // Arrays.sort(arr); //inbuilt sort in java to sort the array
        // printarr(arr); 
        // Arrays.sort(arr,0,4);
        // printarr(arr);
        // Arrays.sort(arr,0,4,Collections.reverseOrder());
        // printarr(arr);
        Arrays.sort(arr,0,4,Collections.reverseOrder());   //To use the Collection we have to change the int to Interger object .
        printarr(arr);
        
    }
    
}
