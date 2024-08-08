public class PalindromeString {
    public static void main(String[] args) {
        String rev="";
        String str="MADAM";
        for (int i = str.length()-1; i>=0; i--) {
            rev=rev+str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            System.out.println("is Palindrome");
        }
        else {
            System.out.println("is not a Palindrome");
        }
    }
}
