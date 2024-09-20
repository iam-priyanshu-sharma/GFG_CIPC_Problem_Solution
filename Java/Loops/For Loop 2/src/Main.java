import java.util.Scanner;

class Main {
    public static void utility (String s) {
        // Length of string is given by s.length()
        // character at any index i is given by s.charAt(i)
        for (int i = 0; i < s.length (); i += 2) {
            System.out.print (s.charAt (i));
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String s = scanner.nextLine ();
            utility (s);
            System.out.println ();
        }
        scanner.close ();
    }
}