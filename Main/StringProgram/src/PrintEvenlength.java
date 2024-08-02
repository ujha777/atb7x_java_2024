import java.awt.*;

public class PrintEvenlength {
    public static void main(String[] args) {
        String str="i am Geeks for Geeks and a Geek";
    printWords(str);
    }

    public static  void  printWords(String s){
        String[] words = s.split(" ");
        int[] wl = new int[words.length];
        for (int i = 0; i < words.length; i++) {
           wl[i]= words[i].length();
           if (wl[i]%2==0){
               System.out.println(words[i]);
           }
        }
    }
}
