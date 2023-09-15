package OOPS;

public class multiLevel_inheritance {
    public static void main(String args[]){
        Dog Tommy = new Dog();
        Tommy.eat();
        Tommy.legs = 4;
        System.out.println("No of legs of a dog"+Tommy.legs);
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
    int legs;
}
class Dog extends Mammal{
    String breed;

}
