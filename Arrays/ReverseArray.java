public class ReverseArray {
    public static void reverse(int numbers[]){
        int first =0 ,last = numbers.length-1;
        while (first<last){
            //swap
            int temp = numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int number[]={1,2,4,5,7,8,9};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    
}
