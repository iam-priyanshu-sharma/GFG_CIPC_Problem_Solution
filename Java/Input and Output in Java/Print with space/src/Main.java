import java.util.Scanner;

class Main {
    public static void utility (String a, String b) {
        //Write your code below that prints a <space> b
        System.out.println (a + " " + b);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Enter string 1st: ");
            String a = scanner.nextLine ();
            System.out.print ("Enter string 2nd: ");
            String b = scanner.nextLine ();
            utility (a, b);
        }
    }
}