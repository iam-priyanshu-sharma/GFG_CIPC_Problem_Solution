import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = Integer.parseInt (read.readLine ());
            printPrimeFactorization (n);
            System.out.println ();
        }
    }

    public static void printPrimeFactorization (int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print (i + " ");
                n /= i;
            }
        }
    }
}