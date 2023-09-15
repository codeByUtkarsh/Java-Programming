package OOPS;

public class interfac {
    public static void main (String args[]){
        Queen Q1 = new Queen();
        Q1.moves();
    }  
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up, down , left , right , diagonal (in all 4 directions)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up , down , left , right");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up , down , left , right, Diagonal - (by 1 step)");
    }
}
