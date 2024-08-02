public class CountNumberOfWord {
    public static void main(String[] args) {
        String str2= "MOM OR DAD OR SON";int count=0;
        String[] newstr=str2.split(" ");
        for (String val:newstr){
            if (val.endsWith("OR"))
            count++;

        }
        System.out.println(count);
    }
}
