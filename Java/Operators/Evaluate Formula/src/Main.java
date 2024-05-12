import java.util.Scanner;

class Main {

    public static void utility (int a, int b, int c, int d) {
        //Complete the code above that stores the output of the expression
        int res = ((a + b) / c) + d;

        //This prints the output. Don't change it!
        System.out.println (res);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter value of a, b ,c and d: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            int c = scanner.nextInt ();
            int d = scanner.nextInt ();
            utility (a, b, c, d);
        }
        scanner.close ();
    }
}