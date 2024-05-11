import java.util.Scanner;

class Main {

    public static void utility (String a, String b) {
        System.out.print (a + " " + b);
    }


    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();
        while (t-- > 0) {
            System.out.print ("Enter 1st string: ");
            String a = scanner.nextLine ();
            System.out.print ("Enter 2nd string: ");
            String b = scanner.nextLine ();
            utility (a, b);
            System.out.println (); //This auto appends the new line
        }
        scanner.close ();
    }
}