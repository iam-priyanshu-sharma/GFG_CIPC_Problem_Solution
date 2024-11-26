import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static int countDistinct (ArrayList<Integer> numbers) {
        int distinctCount = 0;

        for (int i = 0; i < numbers.size (); i++) {
            int currentNumber = numbers.get (i);
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if ( numbers.get (j) == currentNumber ) {
                    isDistinct = false;
                    break;
                }
            }

            if ( isDistinct ) {
                distinctCount++;
            }
        }

        return distinctCount;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter list of numbers with space: ");
            String[] input = read.readLine ().trim ().split ("\\s+");
            ArrayList<Integer> list = new ArrayList<> ();

            for (String s : input) {
                list.add (Integer.parseInt (s));
            }

            System.out.println (countDistinct (list));
        }
    }
}