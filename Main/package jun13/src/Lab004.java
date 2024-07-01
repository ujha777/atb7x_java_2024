public class Lab004 {
    public static void main(String[] args) {
        int b=99;
        //b=b+1;
        //b++;

        //Pre
     // b=++b;//increment before assign 99+1=100

      //  System.out.println(b);//100
        System.out.println(++b + ++b);
        int c=99;
        c=c++;//assign before increment
       System.out.println(c);
    }
}
