public class PrintwithUpdatedWord {
    public static void main(String[] args) {
        String str=" a red seed";String ns="";
        String[] words = str.split(" ");
        for (String word:words){
            if (word.equals("red")){
                ns=ns+"blue"+" ";
            }else{
                ns=ns+word+" ";
            }
        }
        System.out.println(ns);
        String str1=" a red seed";String ns1="";
        String[] words1 = str1.split(" ");
        for (String word:words1){
            if (!word.equals("red")){

                ns1=ns1+word+" ";
            }
        }
        System.out.println(ns1);
    }
}
