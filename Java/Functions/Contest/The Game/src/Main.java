import java.util.Scanner;

class Main {
    public static String theGame (int n) {

        //return a string as True or False
        //Write your code in this function
        if ( n % 2 == 0 ) {
            return "True";
        } else {
            return "False";
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter the number of coin stacked: ");
            int n = scanner.nextInt ();
            System.out.println (theGame (n));
        }
        scanner.close ();
    }
}