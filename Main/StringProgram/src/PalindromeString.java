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

        String str1="ABCCBA";
        System.out.println(isPalindrome(str1));
    }


    static  boolean isPalindrome(String str){
        int begin=0;
        int end= str.length()-1;
        while (begin<end){
            if (str.charAt(begin)!=str.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
