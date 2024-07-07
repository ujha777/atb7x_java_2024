package inheritance;

public class MainTest {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather();
        gf.property();

        Father f =new Father();
        f.property();

        Son s = new Son();
        s.property();

        GrandFather gf1 = new Father();
        GrandFather gf2= new Son();
        gf1.property();
        gf2.property();

        MainTest t = new MainTest();
        t.property();


    }

    public void property(){
        System.out.println("4 BHK");
    }
}
