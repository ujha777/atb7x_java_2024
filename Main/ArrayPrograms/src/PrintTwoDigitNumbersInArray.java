public class PrintTwoDigitNumbersInArray {
    public static void main(String[] args) {
        int[] a={2,33,2,21,2,334,444,2,3345,532,2,3,66};
        System.out.println("Print only two digit");
        for (int i = 0; i < a.length; i++) {
            if (a[i]>9&&a[i]<1000){

                System.out.println(a[i]);
            }

        }

        int arr1[]={4,9,635,64};
        System.out.println("Print square root");
        for (int i = 0; i < arr1.length; i++) {


                System.out.println(i+"----->"+Math.sqrt(arr1[i]));


        }
    }
}
