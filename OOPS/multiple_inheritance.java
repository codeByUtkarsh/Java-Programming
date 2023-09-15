package OOPS;

public class multiple_inheritance {
    public static void main(String args[]){
        Beer B1 = new Beer();
        B1.eatGrass();
        B1.eatMeat();
    }
}
// Bear comes in both herbivore and carnivore , Therefore it can aquire the properties of both the interfaces 

interface herbivore{
    void eatGrass();
}

interface carnivore{
    void eatMeat();
}

class Beer implements herbivore , carnivore{
    public void eatGrass(){
        System.out.println("Beer eats Grass /n");
    }
    public void eatMeat(){
        System.out.println("Beer can eats meat also.");
    }
}