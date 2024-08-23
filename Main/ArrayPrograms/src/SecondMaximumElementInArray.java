import java.util.Arrays;
import java.util.Scanner;

public class SecondMaximumElementInArray {
    public static void main(String[] args) {
        //{5,8,12,20}--->a[i]>a[largest]--->res=largest-->largest=i
        //{5,8,12,12}-->a[i]==a[largest]-->Ignore
        //{12,12,12,7}-->res=-1
        //{12,8,12,7}:Ignore-->a[i]<=a[res]
        //{12,7,12,9}:a[i]>a[res]


        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(SecondLargestElement(arr)));

    }

    static int[] SecondLargestElement(int[] arr){
        int second_max=-1;
        int largest=0;
        //Traverse array 1--->arr.length
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[largest])
            {
                second_max=largest;
                largest=i;
            } else if (arr[i]!=arr[largest]) {
                if (second_max==-1||arr[i]>arr[second_max])
                    second_max=i;
            }
        }
        return new int[]{arr[second_max]};
    }
}
