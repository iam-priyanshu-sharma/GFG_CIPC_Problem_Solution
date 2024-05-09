import java.util.Scanner;

class Geeks {

    // Function to print a and c comment the line that outputs b
    static void comment (int a, int b, int c) {

        // Prints a
        System.out.println (a);
        // Prints b
        // System.out.println (b);
        // Prints c
        System.out.println (c);
    }
}

class Main {

    public static void main (String[] args) {
        // Creating an Object of Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        // Getting number of testcases
        int testcase = scanner.nextInt ();

        // Taking input for all testcases
        while (testcase-- > 0) {
            System.out.println ("Enter value of A, B and C: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            int c = scanner.nextInt ();

            // Calling the comments function of class Geeks
            Geeks.comment (a, b, c);
        }
    }
}