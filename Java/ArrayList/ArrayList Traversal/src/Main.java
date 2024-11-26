import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static void listTraversal (ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size (); i++) {
            System.out.print (numbers.get (i));
            if ( i != numbers.size () - 1 ) {
                System.out.print (" ");
            }
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter list of numbers: ");
            String[] input = read.readLine ().split ("\\s+");
            ArrayList<Integer> list = new ArrayList<> ();

            for (String s : input) {
                list.add (Integer.parseInt (s));
            }

            listTraversal (list);
            System.out.println ();
        }
    }
}