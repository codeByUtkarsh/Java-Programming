package Stacks;

import java.util.Stack;

public class Reverse {
    public static String reverseString(String s){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < s.length()){
            st.push(s.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!st.isEmpty()){
            char curr = st.pop();
            result.append(curr);
        }

        return result.toString();

    }
    public static void main(String args[]){

        String str = "abc";
        System.out.println(reverseString(str));

    }
    
}
