public class BreakSentenceIntoWords {
    public static void main(String[] args) {
        String str="I am a boy";
        String[] ns = str.split(" ");
        for (String word:ns){
            System.out.println(word);
        }

    }
}
