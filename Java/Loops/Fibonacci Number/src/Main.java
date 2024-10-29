import java.util.Scanner;

class Main {
    public static int fibonacci (int n) {
        if ( n <= 1 ) {
            return n;
        }

        int fibNum = 1;
        int prevFibNum = 1;

        for (int i = 2; i < n; i++) {
            int temp = fibNum;
            fibNum = fibNum + prevFibNum;
            prevFibNum = temp;
        }

        return fibNum;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            int ans = fibonacci (n);
            System.out.println (ans);
        }
        scanner.close ();
    }
}