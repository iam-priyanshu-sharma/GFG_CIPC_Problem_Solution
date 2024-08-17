import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (br.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String str = br.readLine ();
            String s1 = str.split (" ")[0];
            String s2 = str.split (" ")[1];

            if ( Solution.isAnagram (s1, s2) ) {
                System.out.println ("YES");
            } else {
                System.out.println ("NO");
            }
        }
    }
}

class Solution {
    public static boolean isAnagram (String a, String b) {
        a = a.replaceAll ("\\s", "").toLowerCase ();
        b = b.replaceAll ("\\s", "").toLowerCase ();

        if ( a.length () != b.length () ) {
            return false;
        }

        char[] charArray1 = a.toCharArray ();
        char[] charArray2 = b.toCharArray ();
        Arrays.sort (charArray1);
        Arrays.sort (charArray2);

        return Arrays.equals (charArray1, charArray2);
    }
}