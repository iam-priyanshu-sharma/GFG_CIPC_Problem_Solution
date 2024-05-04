import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static int nextPrime (int n) {
        BigInteger x = BigInteger.valueOf (n);
        x = x.add (BigInteger.ONE);

        while (true) {
            if ( isPrime (x) ) {
                return x.intValue ();
            }
            x = x.add (BigInteger.ONE);
        }
    }

    public static boolean isPrime (BigInteger x) {
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
            int ans = nextPrime (n);
            System.out.println ("Next Prime number after " + n + " : " + ans);
        }
        scanner.close ();
    }
}