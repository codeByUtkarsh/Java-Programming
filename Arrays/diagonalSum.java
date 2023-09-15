public class diagonalSum {
    public static int diagSum(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum = sum +matrix[i][j];
                }
            }
        }
        int secSum=0;
        int i=0,j=m-1;
        while(i < n && j>=0){
            secSum += matrix[i][j];
            i++;
            j--;
        }
        int totalSum = sum +secSum;
        return totalSum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println("The Diagonal of this matrix is = "+ diagSum(matrix));
    }
}
