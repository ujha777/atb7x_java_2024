public class MaximumElement {

    public static void main(String[] args) {
        int[] array={77,3,2,11,322,11,21,11,55,8653,9999};
        int max=1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];

            }
        }
        System.out.println(max);
    }

}
