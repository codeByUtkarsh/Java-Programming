
package PriorityQueue;
import java.util.*;

public class Priority {
    static class Student implements Comparable<Student>{
        String name ;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank= rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 5));
        pq.add(new Student("B", 4));
        pq.add(new Student("C", 10));
        pq.add(new Student("D", 12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"-->"+ pq.peek().rank);
            pq.remove();
        }


    }
    
}
