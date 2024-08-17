import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String str = read.readLine ();
            System.out.println (Solution.isPanagram (str) ? "1" : "0");
        }
    }
}

class Solution {
    public static boolean isPanagram (String str) {
        boolean[] mark = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i);

            if ( ch >= 'A' && ch <= 'Z' ) {
                ch = (char) (ch + 'a' - 'A');
            }

            if ( ch >= 'a' && ch <= 'z' && !mark[ch - 'a'] ) {
                mark[ch - 'a'] = true;
                count++;
            }
        }

        return count == 26;
    }
}