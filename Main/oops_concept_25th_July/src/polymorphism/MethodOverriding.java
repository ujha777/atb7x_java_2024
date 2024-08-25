package polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();
        Dog d=new Dog();
        d.bark();
        Dog d1=new Hound();
        d1.bark();
       // Hound h2=new Dog();
       // h2.bark();
    }
}
