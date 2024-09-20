import java.util.Scanner;

class Main {
    public static void utility (int x) {
        while (x >= 0) {
            System.out.print (x + " ");
            x--;
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int x = scanner.nextInt ();
            utility (x);
            System.out.println ();
        }
        scanner.close ();
    }
}