public class InsertStringIntoAnotherString {
    public static void main(String[] args) {
        String str1="GangeshJha";
        String str2="Gunjan";
        String newstring=new String();
        int index=6;
        for (int i = 0; i < str1.length(); i++) {
            newstring+=str1.charAt(i);
            if (i==index){
                newstring=newstring+str2;


            }

        }
        System.out.println(newstring);

        //By using substring method
        String s1="My name Gangesh";
        String s2="is";
        String s = s1.substring(0, 8) + s2 + " "+s1.substring(8);
        System.out.println(s);


    }
}
