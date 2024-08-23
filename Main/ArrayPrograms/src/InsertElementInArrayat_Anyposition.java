import java.util.Arrays;

public class InsertElementInArrayat_Anyposition {
    public static void main(String[] args) {
       int arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        int x=7;
        int pos=2;
        int n=arr.length;
        arr=insertelement(arr, n, x, pos);
        System.out.println(Arrays.toString(arr));



    }
    static int[] insertelement(int arr[],int n, int x,int pos){
        // create a new array of size n+1
        int newarr[] = new int[n + 1];
        int i;
        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n+1; i++)
        {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }



        return newarr;

    }
}
