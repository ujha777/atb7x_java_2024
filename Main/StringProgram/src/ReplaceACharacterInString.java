public class ReplaceACharacterInString {
    public static void main(String[] args) {
        String str="Geeks Gor Geeks";
        String s = str.replace('e', 't');
        System.out.println(s);
        
        int Index=6;
        char ch='F';
        String str1 = str.substring(0, Index) + ch + str.substring(Index + 1);
        System.out.println(str1);

        StringBuilder sb=new StringBuilder(str);
        sb.setCharAt(3,ch);
        System.out.println(sb);

    }
}
