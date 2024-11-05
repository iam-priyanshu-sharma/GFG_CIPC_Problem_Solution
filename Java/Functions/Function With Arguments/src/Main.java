import java.util.Scanner;

class Main {

    static void argumentFunction (int a, int b) {
        System.out.println (a + b);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter two numbers: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            argumentFunction (a, b);
        }
        scanner.close ();
    }
}