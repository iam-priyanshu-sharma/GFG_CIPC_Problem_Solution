import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static String sliceString (String s) {
        return s.substring (1, s.length () - 1);
    }


    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String s = read.readLine ().trim ();

            String slicedString = sliceString (s);

            System.out.println ("Sliced string: " + slicedString);
        }
    }
}