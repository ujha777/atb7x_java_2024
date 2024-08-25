package inheriance_concept;

public class Test {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.home();
        Father f1=new Father();
        f1.home();
        Grandfather gf=new Grandfather();
        gf.home();

        Grandfather gf1=new Son();
        gf1.home();
        Grandfather gf2=new Father();
        gf2.home();
        Father f2=new Son();
        f2.home();

    }
}
