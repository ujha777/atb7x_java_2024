public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] newarr = leftrotateOne(arr, 5);
        for (int i = 0; i <newarr.length ; i++) {
            System.out.print(newarr[i]+" ");
        }

    }

    static int[] leftrotateOne(int arr[],int n){
        int temp=arr[0];
        for (int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        return arr;
    }

}
