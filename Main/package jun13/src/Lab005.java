public class Lab005 {
    public static void main(String[] args) {
        int b=1;
        System.out.println(b + ++b + ++b + b);
        //1+2+3+3
        int c=1;
        System.out.println(c++ + c + c++ + c);
        //Break down
        //c and exp
        // c++->c=1,exp1=1 ->After c=2
        // c->c=2,exp2=2
        //c++->c=2, exp=3-->after  c=3
        //c->c=3, exp4=3
    }
}
