import java.util.Scanner;

class Main {

    public static void utility (int number) {
        //Write your if-else statement below
        if ( number > 100 ) {
            System.out.println ("Big");
        } else {
            System.out.println ("Number");
        }
        //Write your if-else statement above
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