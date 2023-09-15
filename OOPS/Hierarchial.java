package OOPS;

public class Hierarchial {
    public static void main(String args[]){
        Fish tuna= new Fish();
        tuna.eat();
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
