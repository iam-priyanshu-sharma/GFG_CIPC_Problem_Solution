import java.util.Scanner;

class Main {
    public static String withinTheRange (int n) {

        //return a string True or False according to the n
        int remainder = n % 10;
        return remainder >= -3 && remainder <= 3 || remainder >= 7 ? "True" : "False";
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter the number you want to check: ");
            int n = scanner.nextInt ();
            System.out.println (withinTheRange (n));
        }
        scanner.close ();
    }
}