public class CapitalizeEachWord {
    public static void main(String[] args) {
        String str="a red seed";
        String ns1="";
        String[] words = str.split(" ");
        for (String word:words){
            char f= word.charAt(0);
            f=Character.toUpperCase(f);
            ns1=ns1+f+word.substring(1)+" ";
        }
        System.out.println(ns1);
    }
}
