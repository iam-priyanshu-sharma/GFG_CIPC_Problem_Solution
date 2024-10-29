import java.util.Scanner;

class Main {
    public static int gcd (int a, int b) {

        int min = Math.min (a, b);
        int ans = 0;
        for (int i = 1; i <= min; i++) {
            if ( a % i == 0 && b % i == 0 ) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter two numbers: ");
            int A = scanner.nextInt ();
            int B = scanner.nextInt ();
            int ans = gcd (A, B);
            System.out.println (ans);
        }
        scanner.close ();
    }
}