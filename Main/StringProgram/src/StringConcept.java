public class StringConcept {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        System.out.println(str1.length());
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,5));
        System.out.println(str1.charAt(3));

        String s1="geeks";
        String s2="geeks";
        if (s1==s2)
            System.out.println("Yes");
        else
            System.out.println("No");
        String s3=new String("geeks");
        if (s1==s3)
            System.out.println("Yes");
        else
            System.out.println("No");

        String str2="for";
        int res=str1.compareTo(str2);
        if (res==0)
            System.out.println("Same");
        if (res>0)
            System.out.println("s1 greater");
        if (res<0)
            System.out.println("s1 smaller");

        String str3="geeks";
        System.out.println(str1.indexOf(str3,1));
        System.out.println(str1.indexOf(str3));

        String n1="geeks";
        String n2=n1;
        n1=n1.concat("forgeeks");
        System.out.println(n1);
        System.out.println(n1==n2);

    }
}
