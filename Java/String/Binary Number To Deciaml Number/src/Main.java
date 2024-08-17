import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int T = Integer.parseInt (br.readLine ().trim ());

        while (T-- > 0) {
            System.out.print ("Enter a Binary Number: ");
            String str = br.readLine ().trim ();
            Solution ob = new Solution ();
            int ans = ob.binary_to_decimal (str);
            System.out.println ("Decimal Number: " + ans);
        }
    }
}

class Solution {
    public int binary_to_decimal (String str) {
        return Integer.parseInt (str, 2);
    }
}