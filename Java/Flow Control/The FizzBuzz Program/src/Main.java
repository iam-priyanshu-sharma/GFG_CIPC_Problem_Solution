import java.util.Scanner;

class Main {

    public static void fizzBuzz (int number) {
        // Write your code here.
        if ( number % 3 == 0 && number % 5 == 0 ) {
            System.out.println ("FizzBuzz");
        } else if ( number % 3 == 0 ) {
            System.out.println ("Fizz");
        } else if ( number % 5 == 0 ) {
            System.out.println ("Buzz");
        } else {
            System.out.println (number);
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int number = scanner.nextInt ();
            fizzBuzz (number);
        }
        scanner.close ();
    }
}