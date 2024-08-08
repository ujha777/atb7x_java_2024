public class SwapFirstAndLatCharacter {

    public static void main(String[] args) {



        String str[]={"Gangesh","is","QA","Automation","Tester"};
        swapped(str);

    }

    static void   swapped(String arr[]){
        String newstr="null";
        for (int i = 0; i < arr.length ; i++) {
            char first=arr[i].charAt(0);
            int len=arr[i].length();
            char last=arr[i].charAt(len-1);
            String m=arr[i].substring(1,len-1);
            newstr=last+m+first;
            System.out.print(newstr.toString()+" ");
        }



    }
}
