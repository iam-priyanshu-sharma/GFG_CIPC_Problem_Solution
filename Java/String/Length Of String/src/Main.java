import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader read = new BufferedReader ((new InputStreamReader (System.in)));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String str = read.readLine ();
            System.out.println ("Length of string: " + Solution.lengthString (str));
        }
    }

}

class Solution {
    public static int lengthString (String str) {
        return str.length ();
    }
}