import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int T = scanner.nextInt ();

        while (T > 0) {
            ArrayList<Integer> A = new ArrayList<> ();
            System.out.print ("Enter number of queries you want to perform: ");
            int q = scanner.nextInt ();

            while (q > 0) {
                System.out.print ("Enter operation you want to perform: ");
                char c = scanner.next ().charAt (0);
                if ( c == 'a' ) {
                    System.out.print ("Enter a number: ");
                    int x = scanner.nextInt ();
                    add_to_ArrayList (A, x);
                }

                if ( c == 'b' )
                    sort_ArrayList_Asc (A);

                if ( c == 'c' )
                    reverse_ArrayList (A);

                if ( c == 'd' )
                    System.out.print (size_Of_ArrayList (A) + " ");

                if ( c == 'e' )
                    print_ArrayList (A);

                if ( c == 'f' )
                    sort_ArrayList_Desc (A);

                q--;
            }
            T--;
            System.out.println ();
        }
    }

    public static void add_to_ArrayList (ArrayList<Integer> A, int x) {
        A.add (x);
    }

    public static void sort_ArrayList_Asc (ArrayList<Integer> A) {
        Collections.sort (A);
    }

    public static void reverse_ArrayList (ArrayList<Integer> A) {
        Collections.reverse (A);
    }

    public static int size_Of_ArrayList (ArrayList<Integer> A) {
        return A.size ();
    }

    public static void sort_ArrayList_Desc (ArrayList<Integer> A) {
        A.sort (Collections.reverseOrder ());
    }

    public static void print_ArrayList (ArrayList<Integer> A) {
        for (int i = 0; i < A.size (); i++) {
            System.out.println (A.get (i));
            if ( i != A.size () ) {
                System.out.println (" ");
            }
        }
    }
}