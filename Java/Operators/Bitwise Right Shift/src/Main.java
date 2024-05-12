import java.util.Scanner;

class Main {

    public static void utility (int a, int b) {

        //just complete below statement
        int ans = a >> b;

        //print the result
        System.out.println (ans);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number and number of times to shift: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            utility (a, b);
        }
        scanner.close ();
    }
}