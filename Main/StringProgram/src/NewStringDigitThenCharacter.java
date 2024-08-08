public class NewStringDigitThenCharacter {
    public static void main(String[] args) {
        String str=" NO26 Sound";
        String newstr=" ";
        String newstr1=" ";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)){
                newstr+=c;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)){
                newstr1+=c;
            }
        }
        System.out.println(newstr+newstr1);
    }
}
