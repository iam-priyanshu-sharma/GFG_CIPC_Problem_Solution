import java.util.Scanner;

class Main {
    public static void divisor (int n) {
        for (int i = 1; i <= n; i++) {
            if ( n % i == 0 ) {
                System.out.print (i + " ");
            }
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            divisor (n);
            System.out.println ();
        }
        scanner.close ();
    }
}