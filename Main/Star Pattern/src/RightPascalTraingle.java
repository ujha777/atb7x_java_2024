public class RightPascalTraingle {
    public static void main(String[] args) {
        int rows=5;
        // Print the left half of the butterfly
        for (int i=1; i<=rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i=1; i<=rows; i++)
        {
            for (int j = i; j <= rows-1; j++)
            {
                System.out.print("*");
            }


            System.out.println();
        }

    }
}
