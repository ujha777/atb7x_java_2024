public class PrintWordStartWithSpecificChar {
    public static void main(String[] args) {
        String str="A RED SEED";
        String[] ns = str.split(" ");
        for (String word:ns){

            if (word.startsWith("R")){
                System.out.println(word);
            }
        }
        //PrintWordEndWithSpecificChar
        System.out.println("ending with specific character");
        for (String word:ns){

            if (word.endsWith("ED")){
                System.out.println(word);
            }
        }
        System.out.println("print word with only  3 charaters");
        for (String word:ns){

            if (word.length()==3){
                System.out.println(word);
            }
        }
        //PrintSpecial word
        String str2= "MOM OR DAD";
        String[] newstr=str2.split(" ");
        for (String val:newstr){
            char f=val.charAt(0);
            char l= val.charAt(val.length()-1);
            if (Character.toUpperCase(l)==Character.toUpperCase(f)){

                System.out.println(val);
            }

        }

    }
}
