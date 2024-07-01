package array;

public class array001 {
    public static void main(String[] args) {
        //Collection of similar elements
        //marks-91,23,45,66,56,77
        //Arrays
        // In a 2 line -->first declaration then initialization
        int[] mynumbers; //declaration
        mynumbers= new int[]{77, 88, 32, 21, 11}; //initialization
        System.out.println(mynumbers[0]);
        //Single line we can show array declaration and intialization
        String[] name= new String[]{"Ajay","Vijay","Rahul"};
        System.out.println(name[0]);

        int[] sal={1,2,3,4};
        System.out.println(sal[0]);

        int[] marks=new int[5];
        for (int i = 1; i < marks.length; i++) {

            System.out.println(i);
            System.out.println(marks[i]);
        }
        String[] fruits=new String[1];
        System.out.println(fruits[0]);



    }
}
