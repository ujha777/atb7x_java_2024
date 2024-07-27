public class LeftPascalTraingle {
    public static void main(String[] args) {
        int numberOfRows=5;

        //There are two outer for loops in this program
        //This is Outer Loop 1: This prints the first half of
        // the Left Pascal triangle pattern
        for (int i= 1; i<=numberOfRows; i++)
        {
            //Prints the whitespaces before the first star of each row
            for (int j=i; j<numberOfRows; j++)
            {
                System.out.print(" ");
            }
            //Prints the stars of each row
            for (int k=1; k<=i;k++)
            {
                System.out.print("*");
            }
            //To move the cursor to new line for next row
            System.out.println();
        }
        //Outer Loop 2: Prints second half of the triangle
        for (int i=numberOfRows; i>=1; i--)
        {
            //Prints the whitespaces before the first star of each row
            for(int j=i; j <=numberOfRows;j++)
            {
                System.out.print(" ");
            }
            //Prints stars of each row
            for(int k=1; k<i ;k++)
            {
                System.out.print("*");
            }
            //Move the cursor to new line after printing a row
            System.out.println();
        }
    }
}
