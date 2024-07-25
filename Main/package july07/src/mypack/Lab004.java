package mypack;

public class Lab004 {
    public static void main(String[] args) {
     Dog d = new Dog();
     Dog d2=new Dog("Labrodor");
     d2.display();
     Dog d3= new Dog("Golden Retriever","DOG TT");
     d3.display();

    }
}
class Dog extends Animal{
    String breed;
    public Dog() {
        System.out.println("Dog dc");
    }

    public Dog(String breed) {
        super("dog type");
        this.breed=breed;
    }

    public Dog(String breed, String type) {
        super(type);
        this.breed=breed;
        System.out.println("PC with 2 Arguments");
    }

    void display(){
        System.out.println("Type "+super.type+"Breed "+this.breed);
    }
}
class  Animal{
    String type ;
    public Animal(String type){
        this.type=type;
    }
    public Animal() {

        System.out.println("animal dc");
    }

}
