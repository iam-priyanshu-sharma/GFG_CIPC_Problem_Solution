import java.util.Scanner;

class Main {

    public static void utility (int number) {
        //Write the if, else if, else statements below
        if ( number > 100 ) {
            System.out.println ("Big");
        } else if ( number < 10 ) {
            System.out.println ("Small");
        } else {
            System.out.println ("Number");
        }
        //Write the if, else if, else statements above
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int number = scanner.nextInt ();
            utility (number);
        }
        scanner.close ();
    }
}