public class NumberRightTraingle {
    public static void main(String[] args) {
        int n=5;

        System.out.println("Pattern-->Incrementing rows and Increasing Traingle");
        for (int i = 1,p=1; i <=n; i++,p++) {

            for (int j = 1; j<=i; j++) {
                System.out.print(p+"");

            }
            System.out.println();
        }

        System.out.println("Pattern-->Decrementing rows and Increasing Traingle");
        for (int i = 1, p = 5; i <=n; i++,p--) {

            for (int j = 1; j<=i; j++) {
                System.out.print(p+"");

            }
            System.out.println();
        }

        System.out.println("Pattern-->Incrementing rows by 2 and Increasing Traingle");
        for (int i = 1,p=0; i <=n; i++,p+=2) {

            for (int j = 1; j<=i; j++) {
                System.out.print(p+"");

            }
            System.out.println();
        }

    }
}
