import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static int missingPositiveNumber (ArrayList<Integer> numbers) {

        //write your code here
        for (int i = 0; i < numbers.size () - 1; i++) {
            if ( numbers.get (i) <= 0 ) {
                numbers.remove (i);
                i--;
            }
        }

        for (int i = 0; i < numbers.size () - 1; i++) {
            for (int j = 0; j < numbers.size () - i - 1; j++) {
                if ( numbers.get (j) > numbers.get (j + 1) ) {
                    int temp = numbers.get (j);
                    numbers.set (j, numbers.get (j + 1));
                    numbers.set (j + 1, temp);
                }
            }
        }

        int smallestMissing = 1;
        for (int num : numbers) {
            if ( num == smallestMissing ) {
                smallestMissing++;
            } else if ( num > smallestMissing ) {
                break;
            }
        }

        return smallestMissing;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter list of numbers seperated by space: ");
            String[] input = read.readLine ().trim ().split ("\\s+");
            ArrayList<Integer> numbers = new ArrayList<> ();

            for (String s : input) {
                numbers.add (Integer.parseInt (s));
            }

            System.out.println (missingPositiveNumber (numbers) + " is the smallest missing positive number.");
        }
    }
}