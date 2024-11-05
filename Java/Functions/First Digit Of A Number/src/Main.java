import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main (String[] arg) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = Integer.parseInt (read.readLine ());
            int answer = firstDigit (n);
            System.out.println (answer);
        }
    }

    public static int firstDigit (int n) {
        while (n > 9) {
            n /= 10;
        }
        return n;
    }
}