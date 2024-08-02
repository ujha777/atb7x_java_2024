import javax.swing.plaf.IconUIResource;

public class FindLongestWord {
    public static void main(String[] args) {
        String str="A red Seed"; String lw="";     int count=0;
        String[] words = str.split(" ");
        for (String word:words){
            if (word.length()>lw.length()){
                lw=word;
            }
            //Print word exist or not
            if (word.equalsIgnoreCase("red")){

                count++;
            }

        }
        System.out.println(lw);
        if (count==0)
            System.out.println("Not Found");
        else
            System.out.println("Found");

    }
}
