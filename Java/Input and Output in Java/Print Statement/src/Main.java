import java.util.Scanner;

class Main {

    public static void utility (String MyInput) {
        //Write your code below that prints myInput
        System.out.println (MyInput);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Provide an Input: ");
            String MyInput = scanner.nextLine ();
            utility (MyInput);
        }
        scanner.close ();
    }
}