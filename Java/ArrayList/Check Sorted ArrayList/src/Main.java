import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    public static boolean isSorted (ArrayList<Integer> numbers) {
        boolean ascending = true;

        for (int i = 0; i < numbers.size () - 1; i++) {
            if ( numbers.get (i) > numbers.get (i + 1) ) {
                ascending = false;
                break;
            }
        }

        boolean descending = true;
        for (int i = 0; i < numbers.size () - 1; i++) {
            if ( numbers.get (i) < numbers.get (i + 1) ) {
                descending = false;
                break;
            }
        }

        return ascending || descending;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter list of numbers: ");
            String[] input = read.readLine ().trim ().split ("\\s+");
            ArrayList<Integer> list = new ArrayList<> ();

            for (String s : input) {
                list.add (Integer.parseInt (s));
            }

            if ( isSorted (list) ) {
                System.out.println ("Sorted");
            } else {
                System.out.println ("Not Sorted");
            }
        }
    }
}