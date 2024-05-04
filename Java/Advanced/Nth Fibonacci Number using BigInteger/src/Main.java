import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static BigInteger fib (int n) {
        BigInteger x = BigInteger.valueOf (n);

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c;

        for (BigInteger i = BigInteger.valueOf (2); i.compareTo (x) <= 0; i = i.add (BigInteger.ONE)) {
            c = a.add (b);
            a = b;
            b = c;
        }

        return b;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            //Taking input n
            System.out.print ("Enter value of N: ");
            int n = scanner.nextInt ();

            System.out.println (n + "th Fibonacci number: " + fib (n));
        }
    }
}