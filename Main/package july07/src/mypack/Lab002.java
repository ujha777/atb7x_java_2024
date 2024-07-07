package mypack;

public class Lab002 {
    public static void main(String[] args) {
        Student s = new Student();
        s.message();
        s.display();
    }
}
class Student extends Person{
    void message(){
        System.out.println("I am a student message");
    }
    void display(){
        this.message();
        super.message();
    }
}
class Person{
    void message(){
        System.out.println("I am person message");
    }
}

