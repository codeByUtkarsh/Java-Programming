package Heaps;

public class HeapSort {
    public static void heapify(int nums[], int i , int n){

        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < n && nums[left] < nums[maxIdx]){
            maxIdx = left;
        }
        if(right< n && nums[right]< nums[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = nums[i];
            nums[i]=nums[maxIdx];
            nums[maxIdx] = temp;

            heapify(nums , maxIdx , n);
        }
    }
    public static void heapSort(int nums[]){
        //Build a max heap (include only non leaf nodes)
        int n= nums.length;
        for(int i=n/2; i>=0;i--){

            heapify(nums, i, n);
        }
        //push the largest at the end
        for(int i=n-1;i>0;i--){

            //swap the first and largest element
            int temp = nums[0];
            nums[0]=nums[i];
            nums[i]= temp;

            heapify(nums,0,i);

        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
