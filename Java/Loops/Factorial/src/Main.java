import java.util.Scanner;

class Main {
    public static int nFactorial (int n) {
        int ans = 1;
        for (int i = n; i > 0; i--) {
            ans *= i;
        }
        return ans;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            int ans = nFactorial (n);
            System.out.println (ans);
        }
        scanner.close ();
    }
}