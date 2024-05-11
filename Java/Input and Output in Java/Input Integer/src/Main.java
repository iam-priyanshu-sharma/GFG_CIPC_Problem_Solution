import java.util.Scanner;

class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a Integer Value: ");
            int myInput = scanner.nextInt ();
            System.out.println (myInput + 10);
        }
        scanner.close ();
    }
}