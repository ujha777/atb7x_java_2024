import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
           arr[i]= sc.nextInt();
        }

        System.out.println(isSortedArray(arr));


    }

    static boolean isSortedArray(int arr[]){
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]<arr[i-1])
                return false;
        }
    return  true;
    }
}
