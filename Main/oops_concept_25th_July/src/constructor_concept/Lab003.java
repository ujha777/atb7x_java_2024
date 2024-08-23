package constructor_concept;

public class Lab003 {
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println(p1.name);
        //Two we can assign value in constructor concept
        //assign value after creating the object
        p1.name="Amit";
        System.out.println(p1.name);
        //assign value at the time of object creation
        Person p2=new Person("Pramod");
        System.out.println(p2.name);
        System.out.println(p2.phone);
        Person p3=new Person("Gangesh");
        System.out.println(p3.name);
        Person p4=new Person("Pramod",457865567);
        System.out.println(p4.name+"  "+p4.phone);
    }
}
