package Strings;
import java.util.*;
public class pal {
    public static boolean ispalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String");
        String str =sc.nextLine();
        System.out.println(ispalindrome(str));
    }

    
}
