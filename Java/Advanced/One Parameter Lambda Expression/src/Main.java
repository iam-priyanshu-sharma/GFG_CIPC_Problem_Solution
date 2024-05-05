import java.util.Scanner;

interface Multiply {
    int multiplyBy5 (int n);
}

class Main {
    public static void main (String[] args) {

        //taking input using Scanner Class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");

        //taking count of testcases
        int t = scanner.nextInt ();

        while (t-- > 0) {

            System.out.print ("Enter value of n: ");
            //taking n
            int n = scanner.nextInt ();

            //calling helperFunction of class Multiply
            Multiply m = helperFunction ();

            //calling method multiplyBy5 of interface Multiply
            System.out.println ("Product of " + n + " and 5: " + m.multiplyBy5 (n));
        }
    }

    public static Multiply helperFunction () {
        return n -> n * 5;
    }
}