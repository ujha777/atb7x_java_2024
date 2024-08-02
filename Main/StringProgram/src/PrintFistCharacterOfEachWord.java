public class PrintFistCharacterOfEachWord {
    public static void main(String[] args) {
        String str="I am a boy";
        String[] ns = str.split(" ");
        for (String word:ns){
            System.out.print(word.charAt(0));
            //Print First 2 CHARCATER IN A STRING
           // System.out.println(word.substring(0,2));
        }

    }
}
