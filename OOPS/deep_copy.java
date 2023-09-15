package OOPS;

public class deep_copy {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name ="utkarsh";
        s1.roll_no = 123;
        s1.password ="abc";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s2.password ="xyz";
        s1.marks[2]=99;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
    
}
class Student {
    String name;
    int roll_no;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

}
