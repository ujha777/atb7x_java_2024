package inheriance_concept;

public class Test2 extends BaseTest{
    void testcard(){
        startBrowser();
        closeBrowser();
    }

    public static void main(String[] args) {
      Test2 t1=new Test2();
      t1.testcard();
    }
}
