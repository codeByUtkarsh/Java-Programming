package Bit_manipulation;

public class ith_bit {
    public static int getIthBit(int n, int i){
        int bitmask= 1<<i;
        if((n & bitmask)==0 ){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
        
    }
    public static int clearIthBit( int n ,int i){
       int bitmask = ~(1<<i);
       return n & bitmask; 
    }
    public static int updateIthBit(int n, int i, int newBit){
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return  n | bitmask;
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 1, 0));
    }
    
}
