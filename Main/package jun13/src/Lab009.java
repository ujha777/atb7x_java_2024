public class Lab009 {
    public static void main(String[] args) {
        //Interview FizzBuzz
        //Print a number from 1 to 100
        //For multipes of 3, print Fizz instead of number
        //and for multiple of 5, print Buzz instead of number
        //For number multiples of 3 and 5 print FizzBuzz
        for (int i = 1; i<=100 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            //System.out.println(i);
        }
    }
}
