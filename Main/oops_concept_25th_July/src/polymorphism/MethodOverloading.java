package polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add("2",6));
        System.out.println(add(9,"78"));
    }
   static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static String add(String a,int b)
    {
        return a+b;
    }
    static String add(int b,String a){
        return b+a;
    }
}
