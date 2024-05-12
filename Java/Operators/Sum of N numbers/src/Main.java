import java.util.Scanner;

class Main {
    public static int nSum (int n) {
        int ans = 0;

        //Write your code here to calculate and return sum of n number.

        if ( n % 2 == 0 ) {
            ans = (n / 2) * (n + 1);
            // If n is odd, (n+1) must be even
        } else {
            ans = ((n + 1) / 2) * n;
        }

        return ans;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter value of N: ");
            int n = scanner.nextInt ();
            int ans = nSum (n);
            System.out.println (ans);
        }
        scanner.close ();
    }
}