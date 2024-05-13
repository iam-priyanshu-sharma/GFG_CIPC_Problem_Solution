import java.util.Scanner;

class Main {
    public static int find_greatest_number (int a, int b, int c) {
        // Write your code here.
        if ( a > b && a > c ) {
            return a;
        } else if ( b > c ) {
            return b;
        } else {
            return c;
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter three numbers: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            int c = scanner.nextInt ();
            int greatest_number = find_greatest_number (a, b, c);
            System.out.println ("Greatest number: " + greatest_number);
        }
        scanner.close ();
    }
}