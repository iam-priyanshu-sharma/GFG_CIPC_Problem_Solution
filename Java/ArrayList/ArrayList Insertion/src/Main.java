import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Enter numbers to insert: ");
            String[] temp = scanner.nextLine ().trim ().split (" ");
            int n = temp.length;
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt (temp[i]);
                arr[i] = x;
            }

            ArrayList<Integer> ans = fillArrayList (arr);
            for (int x : ans) System.out.print (x + " ");
            System.out.println ();
        }
    }

    public static ArrayList<Integer> fillArrayList (int[] arr) {
        ArrayList<Integer> NewArrL = new ArrayList<> ();

        for (int num : arr) {
            NewArrL.add (num);
        }

        return NewArrL;
    }
}