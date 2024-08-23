public class MovesZerosToEnd {
    public static void main(String[] args) {
     int[] arr={10,8,0,0,12,0};
     int count=movesZeros(arr);
        // Update all elements at index >=count with value 0
     for (int i = count; i<arr.length;i++)
            arr[i]=0;
     for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
    static int movesZeros(int[] arr){
        int count=0;int i=0;
        for (i = 0; i < arr.length; i++) {
           if (arr[i]!=0) {
               int temp = arr[i];
               arr[i] = arr[count];
               arr[count] = temp;
               count++;
           }

           
        }
       return count;
    }


}
