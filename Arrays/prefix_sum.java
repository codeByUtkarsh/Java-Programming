import java.util.*;
public class prefix_sum {
    public static void p_sum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int prefix[ ]= new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                int currsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(currsum>maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("The max subarray sum is = "+ maxsum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = " );
        int size = sc.nextInt();
        System.out.println("Enter the elements in the array : ");
        int numarr[]= new int[size];
        for(int i=0;i<size;i++){
            numarr[i]=sc.nextInt();
        }
        p_sum(numarr);
        
    }
    
}
