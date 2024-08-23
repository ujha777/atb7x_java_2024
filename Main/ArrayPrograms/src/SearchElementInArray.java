public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[]={33,2,44,211,44};
        int x=44;
        System.out.println("Index is-->"+search(arr,4,x)+" for "+x+" element");
    }

  static   int search(int arr[], int n, int x){

        for (int i=1;i<=arr.length;i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;

    }
}
