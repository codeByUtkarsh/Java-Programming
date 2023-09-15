interface Drawable{
    public void draw();
}
interface Addable{
    int add(int a,int b);
}
public class anonymous_class{
    public static void main(String args[]){
        // int width=10;
        // //lambda
        // Drawable d2 =()->{
        //     System.out.println("Drawing"+width);
        // };
        // d2.draw();

        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

    }
 }

