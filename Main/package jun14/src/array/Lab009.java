package array;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter Sub 1 marks :");
        marks[0]=sc.nextFloat();
        System.out.println("Enter Sub 2 marks :");
        marks[1]=sc.nextFloat();
        System.out.println("Enter Sub 3 marks :");
        marks[2]=sc.nextFloat();
        System.out.println("Enter Sub 4 marks :");
        marks[3]=sc.nextFloat();
        System.out.println("Enter Sub 5 marks :");
        marks[4]=sc.nextFloat();

        for (int i = 0; i <marks.length ; i++) {
            if (marks[i]<30){
                System.out.println("Failed in subject :"+marks[i]);
            }else {
                System.out.println(marks[i]);
            }
        }


    }
}
