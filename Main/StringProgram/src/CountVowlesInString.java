public class CountVowlesInString {
    public static void main(String[] args) {
        int count=0;
        String str="Darsh is  a good boy";


        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (c=='a'||c=='e'||c=='i'
                    ||c=='o'||c=='u'){
                System.out.print(c);
                count++;
            }
        }
        System.out.println("--->"+count);
    }
}
