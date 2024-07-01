package array;

public class Lab007 {
    public static void main(String[] args) {
        int[] a = new int[4];
        //default = [0,0,0,0]
        //JVM = |0,0,0,0|
        //a[4]=90;
        a[3]=21;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        //final means is length is final here not content
        final  int[] ages=new int[5];
        //ages = [0,0,0,0]
        ages[3]=90;
        System.out.println(ages[3]);
        ages[3]=97;
        System.out.println(ages[3]);

        //final for primitive data to fixed the value not for non primitive data

    }
}
