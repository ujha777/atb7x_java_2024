public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int x=4;
        System.out.println("Array size before deleting element--->"+n);
        System.out.println("Array size after Deleting element-->"+deleteElement(arr,n,x));
    }
    static int deleteElement(int arr[],int n,int x){

        int i;
        for (i = 0; i < n ; i++) {
            if (arr[i]==x)
                break;
            if(i==n)
                return n;

        }
        for (int j = i; j <n-1 ; j++) {
            arr[j]=arr[j+1];
        }
        return n-1;
    }
}
