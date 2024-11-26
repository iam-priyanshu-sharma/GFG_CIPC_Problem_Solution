import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static double posAverage (ArrayList<Integer> numbers) {
        int sum = 0;
        int count = 0;

        for (int i : numbers) {
            if ( i >= 0 ) {
                sum += i;
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0;
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

            double average = posAverage (list);
            System.out.println (average);
        }
    }
}