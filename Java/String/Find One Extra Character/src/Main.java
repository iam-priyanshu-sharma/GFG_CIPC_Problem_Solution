import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static char extraChar (String s1, String s2) {

        char result = 0;

        for (int i = 0; i < s1.length (); i++) {
            result ^= s1.charAt (i);
        }

        for (int i = 0; i < s2.length (); i++) {
            result ^= s2.charAt (i);
        }

        return result;

    }

    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter 1st string: ");
            String s1 = read.readLine ().trim ();

            System.out.print ("Enter 2nd string: ");
            String s2 = read.readLine ().trim ();

            System.out.println ("Extra character: " + extraChar (s1, s2));
        }
    }
}