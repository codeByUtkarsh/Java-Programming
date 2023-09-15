import java.util.*;
public class kadaneAlgo {
    public static int kadanes(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for( int i=0;i<num.length;i++){
            currsum+= num[i];
            if( currsum<0){
                currsum=0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,1,-2,-1,-5,-3};
        System.out.println("The Max subarray sum is = " + kadanes(arr));
    }
}
