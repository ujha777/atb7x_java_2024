import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintAnyCharacter {

    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        for (int i = 0; i < str.length(); i++) {
            if (i == 2) {
                System.out.println(str.charAt(i));
            }
        }
        //convert string to string array
        //Iterate over the string
        //using split method
        String[] stringArrayy = str.split(" ");
        for (int i = 0; i < stringArrayy.length; i++) {
            System.out.print(stringArrayy[i] + ", ");
        }


    }
}
