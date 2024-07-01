package array;

public class Lab10 {
    public static void main(String[] args) {
        int[] sal ={34,66,77,99,101};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < sal.length ; i++) {
            if (sal[i]>max){
                max=sal[i];

            }

    }
        System.out.println(max);
    }
}
