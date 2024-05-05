import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {

        //Taking input using Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        //taking total testcases
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter size of array: ");
            //taking count of elements
            int n = scanner.nextInt ();

            //creating an array of size n
            int[] arr = new int[n];

            System.out.println ("Enter elements of array: ");
            //inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = (scanner.nextInt ());
            }

            //calling the maxUsingStreams method printing the result
            System.out.println ("Maximum element in array: " + maxUsingStreams (arr));
        }
    }

    public static int maxUsingStreams (int[] arr) {
        return Arrays.stream (arr).max ().getAsInt ();
    }
}