import java.util.Scanner;

class Main {
    public static void utility (int n) {

        //just complete below statement
        int ans = Math.abs (n % 10);

        //below statement print the result
        System.out.println ("Last digit: " + ans);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            utility (n);
        }
        scanner.close ();
    }
}