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
            System.out.println ("No. of words in string: " + Solution.countWords (str));
        }
    }
}

class Solution {
    public static int countWords (String str) {
        if ( str == null || str.isEmpty () ) {
            return 0;
        }

        String[] words = str.trim ().split ("\\s+");
        return words.length;
    }
}