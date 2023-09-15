package OOPS;

import javax.swing.SpinnerDateModel;

public class abstract_class {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color); 
        chicken c1 = new chicken();
        c1.eat();
        c1.walk();
        c1.changeColor();
        System.out.println("color of a chicken"+" "+ c1.color);
     }
}

//Point 1 - abstract classes can not create an instance or object

abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }

    // Point 2 - In abstract method , implementation is not possible
    abstract void walk();

}
class Horse extends Animal{
    void changeColor(){
        color ="Dark Brown";
    }
    
    void walk(){
        System.out.println("Horse walks on ");
    }
}
class chicken extends Animal{
    void changeColor(){
        color ="yellow";
    }
    void walk(){
        System.out.println("chicken walk on 2 legs");
    }
}
