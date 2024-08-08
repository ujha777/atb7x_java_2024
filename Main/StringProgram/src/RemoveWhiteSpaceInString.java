public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        String str1=" This is a good   boy. ";
        //Remove only start and end index;
      //System.out.println(str1.trim());

        String str2[]=str1.split(" ");
        for (String str3:str2){
            System.out.println("Words in each index--->"+str3);
        }

        //Convert String array in a String
        System.out.println("By using append method in String Builder");
        StringBuilder sb=new StringBuilder();
        for (String str4:str2){
           sb= sb.append(str4);
        }
        System.out.println(sb);
    }
}
