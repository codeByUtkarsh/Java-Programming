public class matrixSearch {
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row =0,  col = matrix[0].length-1;
        while(row< matrix.length && col >=0){
            if(matrix[row][col]== key){
                System.out.println("Found at index ("+ row +","+col +")");
                return true;
            }
            else if(key< matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Sorry , to say but key not found");
        return false;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},
                    {17,18,19,33}};
        stairCaseSearch(arr, 33);
    }
    
}
