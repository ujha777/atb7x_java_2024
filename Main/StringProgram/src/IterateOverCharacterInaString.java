public class IterateOverCharacterInaString {
    public static void main(String[] args) {
        String str="Geeks for Geeks";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c+" ");

        }
    }
}
