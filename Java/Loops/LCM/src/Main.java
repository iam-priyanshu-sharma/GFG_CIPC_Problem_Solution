import java.util.Scanner;

class Main {
    public static int LCM (int a, int b) {
        int max = Math.max (a, b);
        int lcm;

        while (true) {
            if ( max % a == 0 && max % b == 0 ) {
                lcm = max;
                break;
            }
            ++max;
        }
        return lcm;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter two numbers: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            System.out.println (LCM (a, b));
        }
        scanner.close ();
    }
}