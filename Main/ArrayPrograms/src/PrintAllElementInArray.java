public class PrintAllElementInArray {
    public static void main(String[] args) {
        int a[]={23,42,44,3,2,122,33};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //Print even numbers in an array
        System.out.println("Evenn Numbers are below");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){

                System.out.println(a[i]);
            }

        }
        System.out.println("Print number which present at even index");
        for (int i = 0; i < a.length; i++) {
            if (i%2==0){

                System.out.println(i+"----->"+a[i]);
            }

        }
        System.out.println("Evenn Numbers followed by Odd Numbers are below");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){

                System.out.println(a[i]);
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2!=0){

                System.out.println(a[i]);
            }

        }


    }

}
