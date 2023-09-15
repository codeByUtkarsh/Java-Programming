public class xyz {

    public static void pair(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("( ");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]= {2,3,4,5,6,7};
        pair(arr);

    }
}
