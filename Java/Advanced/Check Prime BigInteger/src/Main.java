import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static boolean prime (int n) {

        BigInteger x = BigInteger.valueOf (n);

        if ( x.compareTo (BigInteger.ONE) <= 0 ) {
            return false;
        }

        if ( x.equals (BigInteger.TWO) ) {
            return true;
        }

        if ( x.mod (BigInteger.TWO).equals (BigInteger.ZERO) ) {
            return false;
        }

        for (BigInteger i = BigInteger.valueOf (3); i.multiply (i).compareTo (x) <= 0; i = i.add (BigInteger.TWO)) {
            if ( x.mod (i).equals (BigInteger.ZERO) ) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            boolean ans = prime (n);

            if ( ans ) {
                System.out.println (n + " is a Prime number.");
            } else {
                System.out.println (n + " isn't a Prime number.");
            }
        }
        scanner.close ();
    }
}