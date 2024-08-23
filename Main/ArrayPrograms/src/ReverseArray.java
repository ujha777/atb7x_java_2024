import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={23,223,212,11};
        System.out.println(Arrays.toString(reverseArray(arr)));

    }

    static int[] reverseArray(int[] arr){
      int low=0;int high=arr.length-1;

      while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

      }
        return arr;
    }
}
