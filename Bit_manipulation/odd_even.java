
package Bit_manipulation;
import java.util.*;



public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check it even or odd = ");
        int number = sc.nextInt();
        if ((number & 1) == 1){
            System.out.println("Given number is odd");
        }
        else{
            System.out.println("Giver number is even");
        }

        
    }
}
