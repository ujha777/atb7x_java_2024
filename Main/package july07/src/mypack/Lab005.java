package mypack;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Lab005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();

        Pattern pattern=Pattern.compile("\\s");
        String[] temp=pattern.split(input);
        System.out.println(temp[0]);
        System.out.println(temp[1]);
        String reverse="";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                reverse = temp[i] + reverse;
            else
                reverse = " " + temp[i] + reverse;

        }
        System.out.println(reverse);
    }
}
