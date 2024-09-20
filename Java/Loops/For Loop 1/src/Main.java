import java.util.Scanner;

class Main {
    public static void utility (int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print (n * i + " ");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            utility (n);
            System.out.println ();
        }
        scanner.close ();
    }
}
