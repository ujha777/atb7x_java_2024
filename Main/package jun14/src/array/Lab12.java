package array;

public class Lab12 {
    public static void main(String[] args) {
        //Non Return with no parameter
        saySomethingPlease();

        //Non return with parameter
        sayHelloToYou("Pramod");
        //Return with no parameter
        String str=sayGoodMorning();
        System.out.println(str);
        //Return with parameter
        String final_name=sayGoodEvening("gangesh","gunjan","jha");
        System.out.println(final_name);



    }

    private static String sayGoodEvening(String s1, String s2, String s3) {
        return s1+s2+s3;
    }

    private static String sayGoodMorning() {
        return "Good morning";
    }

    private static void sayHelloToYou(String string) {
        System.out.println("My name is: "+string);
    }

    private static void saySomethingPlease() {
        System.out.println("No return type with no parameter");
    }
}
