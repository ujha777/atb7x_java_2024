public class RemovingLeadingZeros {
    public static void main(String[] args) {
        String str="00000123456";
        String s=null;
        int i=0;
        //Count leading zeros by iterating string using charAt(i) and checking for 0 at the “i” th indices.
        while (i < str.length() && str.charAt(i)=='0') {
            i++;

                //Converting a string into StringBuffer object as strings are immutable
                StringBuffer sb=new StringBuffer(str);
                //Use StringBuffer replace function to remove characters equal to the above count using replace() method.
           s  = sb.replace(0, i, "").toString();


            }
        System.out.println(s);

        }





}
