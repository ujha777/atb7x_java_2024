import java.util.Scanner;

public class SwappingPairsOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(swapCharacters(str));
    }
    static String swapCharacters(String str) {
        if (str == null || str.isEmpty()){
            return str;
    }
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length-1; i+=2) {

                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;

        }

        return new String(ch);
    }
}
