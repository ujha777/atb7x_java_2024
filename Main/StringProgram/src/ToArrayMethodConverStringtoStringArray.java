import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ToArrayMethodConverStringtoStringArray {
    public static void main(String[] args) {
// Custom input string as input
        String str = "Geeks for Geeks";

        // Getting the Set of String
        Set<String> string
                = new HashSet<>(Arrays.asList(str));

        // Printing the setOfString
        System.out.println("String: " + str);

        // Converting Set to String array
        String[] string_array = convert(string);

        // Print the arrayOfString
        // using Arrays.toString() method
        System.out.println("String array : "
                + Arrays.toString(string_array));
    }
    // To convert Set<String> to string array
    public static String[] convert(Set<String> setOfString)
    {

        // Create String[] from setOfString
        String[] arrayOfString
                = setOfString.toArray(new String[0]);

        // return the formed String[]
        return arrayOfString;
    }
}
