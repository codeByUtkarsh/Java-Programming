
import java.util.*;
public class ArrayCC{
    public static int binSearch(int arr[], int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid] == key){
                return mid;

            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,8,9};
        int key = 9;
        int index = binSearch(arr, key);
        System.out.print("The key is available at index no = "+ index);
    }
}
