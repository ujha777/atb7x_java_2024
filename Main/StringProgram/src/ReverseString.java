public class ReverseString {
    public static void main(String[] args) {
        String str="Gangesh";
        int count = str.length();
        String rev="";
        for (int i = 0; i < count; i++) {
          rev=  str.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}
