import java.util.*;
public class subarrays {
    public static void subarr(int num[]){
        Scanner sc = new Scanner(System.in);
        int maxsum =Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int count=0;
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    count=count+num[k];
                    if (count>maxsum){
                        maxsum = count;
                    }
                    if(count<minsum){
                        minsum = count;
                    }
                 }
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println("Max subarray = "+ maxsum);
        System.out.println("Min subarray = "+ minsum);
    }
    public static void main(String args[]){
        int numbers[]={1,3,4,5,6,7};
        subarr(numbers);
    }
    
}
