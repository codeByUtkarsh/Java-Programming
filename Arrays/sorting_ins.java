public class sorting_ins {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){  // outer loop for unsorted sublist

            int temp=arr[i];   //This element is used as the sorted element bcz it's  a single element and single element is always sorted.
            int j =i-1;  //previous element
            while(j>=0 && arr[j]>arr[i]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;    // storing the element at the correcct position after checking.
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,44,5,6,7,5,5,7,8};
        insertionSort(arr);
        printarr(arr);
    }
}
