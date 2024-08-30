import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(areAnagaram(s1,s2));
    }

    static boolean areAnagaram(String s1,String s2){
        final int CHAR=256;
        if (s1.length()!=s2.length())
            return  false;
        int count[]=new int[256];
        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i=0;i<CHAR;i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
