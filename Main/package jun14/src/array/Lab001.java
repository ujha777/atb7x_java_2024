package array;

public class Lab001 {
    public static void main(String[] args) {
        //*->1
        //**->2
        //***->3
        //****->4
        //*****->5

        //how may rows?--->5
        //logic
        //when i=1--->then j=1
        // i=2-->then j=1,2
        //i=3-->then j=1,2,3
        //i=4-->them j=1,2,3,4
        //i=5-->then j=1,2,3,4,5
        int n=5;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Left Traingle Start Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
