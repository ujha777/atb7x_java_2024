package mypack;

public class Lab003 {

    public static void main(String[] args) {
         Student1 s1= new Student1();
        // Person1 p1 = new Person1();
         // If child has default constructor then parent default constructor will be called by super() automatically in java

    }
}
class Student1 extends  Person1{
    Student1(){
        //parent default constructor called by super keyword automatically
        super("Gangesh");
        System.out.println("Student 1-Default Constructor");
    }
}
class Person1{
    Person1(){
        System.out.println("Person 1 -Default Constructor");
    }
    Person1(String s){
        System.out.println("Person 1-Parameterized Constructor");
    }
}
