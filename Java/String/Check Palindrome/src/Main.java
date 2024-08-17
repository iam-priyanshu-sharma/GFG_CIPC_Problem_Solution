import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static boolean isPalin (String s) {
        s = s.replaceAll ("\\s", "").toLowerCase ();

        int start = 0;
        int end = s.length () - 1;

        while (start < end) {
            if ( s.charAt (start) != s.charAt (end) ) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String s = read.readLine ().trim ();

            boolean palindrome = isPalin (s);
            if ( palindrome )
                System.out.println ("True");
            else
                System.out.println ("False");
        }
    }
}