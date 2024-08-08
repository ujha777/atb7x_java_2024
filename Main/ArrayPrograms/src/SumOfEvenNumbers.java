public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int s=0;
        int[] a={44,342,2,1,123,323,4,5,6,7,8};
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0){
                s=s+a[i];
            }
        }
        System.out.println(s);
       int arr[]={1,2,3,4,5,6};
        System.out.println("Product of even numbers");
        int product=1;int count=0;
        for (int i = 0; i <arr.length; i++) {
          if (arr[i]%2==0) {
              product *= arr[i];
              count++;
          }


        }

         System.out.println(product);
        System.out.println(count);


    }
}
