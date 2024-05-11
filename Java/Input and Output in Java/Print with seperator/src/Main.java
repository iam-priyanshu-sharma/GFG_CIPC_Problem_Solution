import java.util.Scanner;

class Main {

    public static void utility (String a, String b, String separator) {
        System.out.println (a + separator + b);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();
        while (t-- > 0) {
            System.out.print ("Enter 1st String: ");
            String a = scanner.nextLine ();
            System.out.print ("Enter 2nd String: ");
            String b = scanner.nextLine ();
            String separator = scanner.nextLine ();
            utility (a, b, separator);
        }
        scanner.close ();
    }
}