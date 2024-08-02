public class AddCharacterToString {
    public static void main(String[] args) {
        String str1="GeeksforGeek";
        char a  ='s';
        String str2 = str1 + a;//using + operator;
        System.out.println(str2);
      //insert() method
        StringBuffer sb=new StringBuffer(str1);
        StringBuffer newstr = sb.insert(3,a);
        System.out.println(newstr);

        //substring method
        String str4="One Three";
        char c='2';
        String str6 = str4.substring(0,4)+ c+ str4.substring(3);
        System.out.println(str6);


    }
}
