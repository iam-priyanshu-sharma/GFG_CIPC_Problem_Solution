import java.util.Scanner;

class Main {

    static int returnValueFunction (int N) {
        return N * 2;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            System.out.println (returnValueFunction (n));
        }
        scanner.close ();
    }
}