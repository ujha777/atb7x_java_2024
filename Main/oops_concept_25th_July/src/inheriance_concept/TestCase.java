package inheriance_concept;

public class TestCase extends BaseTest{
    void testcard(){
        startBrowser();
        getDataFrommySQL();
        System.out.println(gold);
        closeBrowser();
    }
}
