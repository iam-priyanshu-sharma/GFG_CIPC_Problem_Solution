import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        //taking count of total testcases
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter size of Array: ");
            //taking total count of elements
            int n = scanner.nextInt ();

            //creating an array of size n
            int[] arr = new int[n];

            System.out.println ("Enter elements of Array: ");
            //adding elements to the array
            for (int i = 0; i < n; i++)
                arr[i] = (scanner.nextInt ());

            //calling the method sumUsingStreams and printing results
            System.out.println ("Sum of all elements of the Array: " + sumUsingStreams (arr));
        }
    }

    public static int sumUsingStreams (int[] arr) {
        return Arrays.stream (arr).sum ();
    }
}