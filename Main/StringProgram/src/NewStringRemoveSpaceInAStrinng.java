public class NewStringRemoveSpaceInAStrinng {
    public static void main(String[] args) {
        String str="GANGESH GUNJAN JHA";
        String r="";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)){
                r=r+c;
            }
        }
        System.out.println(r);
    }
}
