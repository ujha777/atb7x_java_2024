package constructor_concept;
public class Lab001 {
    public static void main(String[] args) {
     String name=null;
     int age=0;

     Lab001 ob=new Lab001();
     Lab001 ob1=new Lab001("Raju");
     Lab001 ob2=new Lab001("Ajay",87);
     new Lab001("Raj",55);
     ob.m1();
     ob.m1("Anil");



    }
    //Default Constructor without any patrameter
    Lab001(){
        System.out.println("default constructor");
    }
    //parameterized constructor
    Lab001(String name){
        System.out.println(name);

    }
    Lab001(String name,int age){
        System.out.println(name+" have "+age+" years");

    }
    //method with no parameter
    public  void m1(){
        System.out.println("No method");
    }

    //method with 1 parameter
    public  void m1(String nm){

        System.out.println("method-->"+nm);
    }
}
