import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void toBinary (String N) {
        int decimalNumber = Integer.parseInt (N);
        String binaryString = Integer.toBinaryString (decimalNumber);
        System.out.print ("Binary Number: " + binaryString);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int T = Integer.parseInt (br.readLine ().trim ());

        while (T-- > 0) {
            System.out.print ("Enter a decimal number: ");
            String N = br.readLine ().trim ();

            toBinary (N);
            System.out.println ();
        }
    }
}