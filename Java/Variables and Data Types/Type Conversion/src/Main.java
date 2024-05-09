import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static int typeCast (double d) {
        // code here
        return (int) d;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter a double value: ");
            double d = Double.parseDouble (read.readLine ());

            int answer = typeCast (d);

            System.out.println ("After Type Conversion: " + answer);
        }
    }
}