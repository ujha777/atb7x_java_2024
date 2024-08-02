import java.lang.reflect.Array;
import java.util.Arrays;

public class Print2DArray {

    public static void main(String[] args) {
        // Get the array
        int arr[][]
                = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        //By using loop
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("[");
            for (int j=0;j<arr[0].length;j++){
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.print("],");
        }


        System.out.println();
      //for-each loop
        for (int[] row : arr){
            for (int x:row){
                System.out.print(x+" ");
            }
        }
        System.out.println();
        //ToString method
        for(int[] row:arr){
            System.out.print(Arrays.toString(row));
        }

    }
}
