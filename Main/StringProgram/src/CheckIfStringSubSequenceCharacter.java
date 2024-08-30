public class CheckIfStringSubSequenceCharacter {
    public static void main(String[] args) {
      String s1="ABCDEF";
      String s2="ADE";
      int n=s1.length();
      int m=s2.length();

        System.out.println(isSSR(s1,s2,n,m));
    }
   static boolean isSSR(String s1,String s2,int n,int m){
        int j=0;
       for (int i = 0; i < n &&j<m;i++) {
           if (s1.charAt(i)==s2.charAt(j)){
               j++;
           }

       }
       return (j==m);
   }
    }

