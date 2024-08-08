public class CountUpperCharcater {
    public static void main(String[] args) {
        String str="gangesh gunjan jha";
        String str2="Darsh is a cute Boy";

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            //Print each charcter in s atring
           // System.out.print(c);

            //Print ASCII Character
            //System.out.print(c+" "+(int)c);


            char c1=str2.charAt(i);
            //Print only Upper case
           if(Character.isUpperCase(c1)){
               count++;
               System.out.print(c1);
           }


        }
        System.out.println("---->"+count);

    }
}
