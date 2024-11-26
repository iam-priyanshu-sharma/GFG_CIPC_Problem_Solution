import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static ArrayList<Integer> getSmaller (int[] arr, int x) {
        ArrayList<Integer> smallerElements = new ArrayList<> ();

        for (int num : arr) {
            if ( num < x ) {
                smallerElements.add (num);
            }
        }

        return smallerElements;

    }

    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Enter list of numbers: ");
            String[] temp = scanner.nextLine ().trim ().split (" ");
            int n = temp.length;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt (temp[i]);
            }

            System.out.print ("Enter a target number: ");
            int target = scanner.nextInt ();
            scanner.nextLine ();
            ArrayList<Integer> ans = getSmaller (arr, target);

            for (Integer an : ans) {
                System.out.print (an + " ");
            }
            System.out.println ();
        }
    }
}