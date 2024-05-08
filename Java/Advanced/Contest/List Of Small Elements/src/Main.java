import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {

        //Creating an object of Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();//taking the number of testcases

        while (t-- > 0) {
            //Declaring and Initializing an ArrayList
            ArrayList<Integer> arr = new ArrayList<> ();

            System.out.print ("Enter size of ArrayList: ");
            //taking the total number of elements
            int n = scanner.nextInt ();

            System.out.println ("Enter elements of ArrayList: ");
            // adding elements in ArrayList
            for (int i = 0; i < n; i++) {
                arr.add (scanner.nextInt ());
            }

            System.out.print ("Enter a number to find list of smallest elements: ");
            //taking in the value of k
            int k = scanner.nextInt ();

            //calling the getSmaller method
            ArrayList<Integer> ans = getSmaller (arr, k);

            //printing all the numbers which are smaller than k
            for (int i : ans) {
                System.out.print (i + " ");
            }

            System.out.println ();
        }
    }


    public static ArrayList<Integer> getSmaller (ArrayList<Integer> arr, int k) {
        ArrayList<Integer> result = new ArrayList<> ();

        for (int num : arr) {
            if ( num < k ) {
                result.add (num);
            }
        }

        return result;
    }
}