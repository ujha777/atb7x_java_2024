package array;

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        //Check palindrome or not
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Enter a string"+str);

      StringBuilder sb = new StringBuilder(str);
        String reversrestring = sb.reverse().toString();
      if (str.equalsIgnoreCase(reversrestring)){
          System.out.println("Palindrome"+"-->"+ str);
      }else {
          System.out.println("Nope");
      }

        //reverse a string without using reverse function
        String string ="Gangesh";
      String rev="";
        for (int i = 0; i < string.length() ; i++) {
            char ch=string.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }



}
