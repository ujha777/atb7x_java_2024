package LinkedListDemo;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        Student s1=new Student("Amit",4);
        Student s2=new Student("Ajay",2);
        Student s3=new Student("Raju",3);
        Student s4=new Student("Vijay",1);

        List l=new LinkedList();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        System.out.println("Student before sorting : ");
        System.out.println(l);
        Collections.sort(l);
        System.out.println("Student after sorting : ");
        System.out.println(l);



    }
}
