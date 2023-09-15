package OOPS;

public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        bankAccount myAcc= new bankAccount();
        myAcc.username = "Utkarsh Srivastava";
        // This line will produce error cause password is private and when we can change and access this //only in within class or by using function in same class.
        //myAcc.password = "xyz";
        myAcc.setPassword("abxc");
        
    }

    
}
class bankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
