package array;

public class Lab006 {
    public static void main(String[] args) {
        int[] ages = {27,34,55,66};
        //fixed elements
        int[] ages2 = new int[5];
        System.out.println(ages2[0]);
        ages2[0]=9;
        System.out.println(ages2[0]);
        ages2[1]=10;
        ages2[2]=33;
        ages2[3]=99;
        ages2[4]=98;

        String[] breakfast_item = {"milk","bananna","tea","biscuit"};
        int length = breakfast_item.length;
        System.out.println(length);


    }
}
