import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static String reverseString (String s) {
        return new StringBuilder (s).reverse ().toString ();
    }


    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String s = read.readLine ().trim ();
            String reversed = reverseString (s);
            System.out.println ("Reversed string: " + reversed);
        }
    }
}