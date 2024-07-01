public class Lab003 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=20;
        c=30;
        System.out.println(a+b+c);
        a=b=c=99;
        System.out.println(a+b+c);

        int b1=101;//int
        int b2=0101;//binary
        int b3=0Xface;//0X -Hex
        int b4=0b101;//0B- binary

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


        int x=10;
        byte y=(byte)x;
        System.out.println(y);

        int course=10;
        float gst=0.18f;
        float total=course+gst;
        System.out.println(total);



    }
}
