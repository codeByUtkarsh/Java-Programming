package OOPS;

public class supe_r { 
    public static void main(String args[]){
        Horse h1 = new Horse();
        System.out.println(h1.color);

    }
    
}

class Animal{
    String color;           
    Animal(){
        System.out.println("Animal constructor is called   ");
    }
}
class Horse extends Animal{
  
    Horse(){
        super.color= "Dark Brown";
        System.out.println("Horse constructor is called");
    }
}    