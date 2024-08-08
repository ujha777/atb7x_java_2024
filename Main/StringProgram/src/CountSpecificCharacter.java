public class CountSpecificCharacter {
    public static void main(String[] args) {
        String str="gEEks for Geeks";

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            char u=Character.toUpperCase(c);
            if (u=='E'){
                count++;
            }

        }
        System.out.println(count);
    }
}
