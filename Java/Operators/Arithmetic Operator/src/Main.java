import java.util.Scanner;

class Main {
    public static void utility (int x, int y) {
        //Perform addition x+y below
        int p = x + y;
        //Perform subtraction x-y below
        int q = x - y;
        //Perform multiplication x*y below
        int r = x * y;
        //Perform division x/y below
        int s = x / y;
        //Perform modulo operation x%y below
        int t = x % y;

        //The below code prints the output. Don't change it!
        System.out.println ("Sum: " + p + "\n" + "Difference: " + q + "\n" + "Product: " + r + "\n" + "Quotient: " + s + "\n" + "Remainder: " + t);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter two numbers: ");
            int x = scanner.nextInt ();
            int y = scanner.nextInt ();
            utility (x, y);
        }
        scanner.close ();
    }
}