public class NewStringContainUpperCase {
    public static void main(String[] args) {
        String str="I am a BOY who IS VERY NAUGHTY";
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (Character.isUpperCase(c)){
                newstr+=c;
            }
        }
        System.out.println(newstr);
    }
}
