package OOPS;

public class inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

    }
    
}
class Animal{
    String skinColor;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("fish swims");
    }
}
