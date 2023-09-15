package Hashing;
import java.util.*;


public class hashing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //pre computation
        int hash[] = new int[13];
        System.out.println(hash[4]);
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        for(int i=0;i<13;i++){
            System.out.print(hash[i]+" ");
        }

        int q = sc.nextInt();
        while(q>0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
            q--;
        }

    }
}
