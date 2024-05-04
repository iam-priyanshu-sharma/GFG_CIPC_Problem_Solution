import java.math.BigInteger;
import java.util.Scanner;

class MathematicalOperation {
    static BigInteger mod (BigInteger x, BigInteger y) {
        return y.remainder (x);
    }
}

class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int testcase = scanner.nextInt ();

        while (testcase-- > 0) {
            // Taking first element in BigInteger x
            System.out.print ("Enter value of x: ");
            BigInteger x = scanner.nextBigInteger ();

            // Taking second element in BigInteger y
            System.out.print ("Enter value of y: ");
            BigInteger y = scanner.nextBigInteger ();

            // Calling function add to find mod two BigIntegers
            // MathematicalOperation obj = new MathematicalOperation();
            System.out.println (MathematicalOperation.mod (x, y) + " is the remainder when " + x + " divides " + y);
        }
    }
}