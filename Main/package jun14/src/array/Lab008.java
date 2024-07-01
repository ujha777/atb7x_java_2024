package array;

public class Lab008 {
    // == --->reference
    // .equals()--->values/content
    public static void main(String[] args) {
        int[] a1= {1,2,3,4};
        int[] a2= {1,2,3,4};
        //Object equals method points to reference
        System.out.println(a1==a2);
        System.out.println(a1);
        System.out.println(a2);
        //Object equals method points to reference
        System.out.println(a1.equals(a2)); //Object.java--ref
        System.out.println(a2.equals(a1));

        int[] a3=a1;
        System.out.println(a1==a3);

        String s1= "Gangesh";
        String s2= "Gangesh";

        System.out.println(s1==s2);
        //String equals method points to Content
        System.out.println(s1.equals(s2));//String.java-content
        //For only string check for content compairison





    }


}
