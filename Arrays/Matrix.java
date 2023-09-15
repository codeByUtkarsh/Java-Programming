import java.util.*;
public class Matrix {
    public static int largestElement(int arr[][]){
        int largest = Integer.MIN_VALUE;
        int n = arr.length , m = arr[0].length;
        for(int i=0 ;i<n;i++){
            for(int j=0 ; j<m;j++){
                largest = Math.max(largest , arr[i][j]);
            }

        }
        return largest;
    }
    public static int  smallestElement(int arr[][]){
        int smallest = Integer.MAX_VALUE;
        int n = arr.length , m = arr[0].length;
        for(int i=0 ;i<n;i++){
            for(int j=0 ; j<m;j++){
                smallest = Math.min(smallest , arr[i][j]);
            }

        }
        return smallest;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n= matrix.length , m = matrix[0].length;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(largestElement(matrix));
        System.out.println(smallestElement(matrix));

    }
    
}
