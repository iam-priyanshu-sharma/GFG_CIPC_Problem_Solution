import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Addition {
    public static int add (int a, int b) {
        return a + b;
    }
}

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter two number seperated by space: ");
            String[] input = read.readLine ().split (" ");
            int a = Integer.parseInt (input[0]);
            int b = Integer.parseInt (input[1]);
            System.out.println ("Sum: " + Addition.add (a, b));
        }
    }
}