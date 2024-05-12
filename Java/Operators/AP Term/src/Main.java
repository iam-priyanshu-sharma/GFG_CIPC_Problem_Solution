import java.util.Scanner;

class Main {

    public static void utility (int a, int d, int n) {
        int ans = a + (n - 1) * d;
        System.out.println ("Nth term: " + ans);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter first term, common difference and value of n: ");
            int a = scanner.nextInt ();
            int d = scanner.nextInt ();
            int n = scanner.nextInt ();
            utility (a, d, n);
        }
        scanner.close ();
    }
}