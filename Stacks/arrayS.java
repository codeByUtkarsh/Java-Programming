package Stacks;
import java.util.ArrayList;

public class arrayS {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }

        //push 
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(list.size()==0){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek (jhankna)
        public static int peek(){
            if(list.size()==0){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }

    }
    public static void main(String args[]){
        stack st  = new stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();

        }
    }
}
