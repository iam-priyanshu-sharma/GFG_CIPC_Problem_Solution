import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static int findPattern (String s, String p) {
        return s.indexOf (p);
    }


    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String s = read.readLine ().trim ();

            System.out.print ("Enter pattern to find it: ");
            String p = read.readLine ().trim ();

            int index = findPattern (s, p);
            System.out.println ("Pattern found at index: " + index);
        }
    }
}