package Strings;

public class lar_string {
    public static void main(String args[]){
        String fruits[]={"ngjlsaj", "mango", "banana"};
        String largest= fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        } 
        System.out.println("Largest String is = "+ largest);
    }
    
}
