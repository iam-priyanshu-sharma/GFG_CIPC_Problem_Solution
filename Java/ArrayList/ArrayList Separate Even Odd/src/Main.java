import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {


    public static ArrayList<ArrayList<Integer>> evenOdd (ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<> ();
        ArrayList<Integer> oddNumbers = new ArrayList<> ();

        for (int num : numbers) {
            if ( num % 2 == 0 ) {
                evenNumbers.add (num);
            } else {
                oddNumbers.add (num);
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<> ();
        result.add (evenNumbers);
        result.add (oddNumbers);

        return result;
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

            ArrayList<ArrayList<Integer>> evenOdd = evenOdd (list);

            for (Integer integer : evenOdd.getFirst ()) {
                System.out.print (integer + " ");
            }

            System.out.println ();

            for (Integer integer : evenOdd.get (1)) {
                System.out.print (integer + " ");
            }

            System.out.println ();
        }
    }
}