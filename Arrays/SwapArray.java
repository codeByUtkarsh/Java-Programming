import java.net.SocketTimeoutException;

public class SwapArray {
    public static void pairs(int numbers[]){
        int tp =0;
        for (int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("( "+curr+" , "+numbers[j]+" )");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total number of pairs are = "+tp);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        pairs(arr);

    }
    
}
