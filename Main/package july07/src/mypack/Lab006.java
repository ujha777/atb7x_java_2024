package mypack;

public class Lab006 {
    //Polymorphism
    //Constructor overloading
    Lab006(){
        System.out.println("DC");
    }
    Lab006(int a){
        System.out.println("PC1");
    }
    Lab006(int c , int d){
        System.out.println("PC2");
    }
    //Method overloading

    void gift(){
        System.out.println("no param");
    }
    void gift(int a){
        System.out.println("int is a"+a);
    }
    void gift(int a ,int b){
        System.out.println("int is a and b"+a+""+b);
    }
    void gift(String s){
        System.out.println("my name is"+ s);
    }

    public static void main(String[] args) {
        Lab006 ob=new Lab006();
        ob.gift();
        Lab006 ob1 = new Lab006();
        ob1.gift(7);
        Lab006 ob2=new Lab006();
        ob2.gift(9,99);
        Lab006 ob3=new Lab006();
        ob3.gift("Gangesh");
    }
}
