import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static BigInteger factorial (int x) {
        BigInteger n = BigInteger.valueOf (x);
        BigInteger factorial = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo (n) <= 0; i = i.add (BigInteger.ONE)) {
            factorial = factorial.multiply (i);
        }
        return factorial;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int testcase = scanner.nextInt ();

        while (testcase-- > 0) {
            //Taking input x
            System.out.print ("Enter the number: ");
            int x = scanner.nextInt ();

            System.out.println ("Factorial of " + x + " : " + factorial (x));
        }
    }
}