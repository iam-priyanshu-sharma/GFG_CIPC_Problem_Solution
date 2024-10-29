import java.util.Scanner;

class Main {

    public static int nextPrime (int n) {
        while (true) {
            n++;
            if ( isPrime (n) ) {
                return n;
            }
        }
    }

    public static boolean isPrime (int n) {
        if ( n == 1 ) {
            return false;
        }

        if ( n == 2 || n == 3 ) {
            return true;
        }

        if ( n % 2 == 0 || n % 3 == 0 ) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if ( n % i == 0 || n % (i + 2) == 0 ) {
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
            System.out.println (ans);
        }
        scanner.close ();
    }
}