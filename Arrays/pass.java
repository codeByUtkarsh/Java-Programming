public class pass {
    public static void doit(String str){
        str.charAt(0) = 'T';
        System.out.println(str);
    }
    public static void main(String args[]){
        String s = "raj";
        s.charAt(0);
        doit(s);
                
    }
    
}
