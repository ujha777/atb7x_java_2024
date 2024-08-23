package constructor_concept;

public class Person {
    String name="null";
    long phone;
    //DC
    Person(){
        System.out.println("object is cretaed");
    }
    Person(String namegiven){
        this.name=namegiven;
    }
    Person(String namegiven,long ph){
        this.name=namegiven;
        this.phone=ph;
    }
}
