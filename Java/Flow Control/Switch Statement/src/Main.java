import java.util.Scanner;

class Main {

    public static void utility (int number) {

        //write your code here
        switch (number) {
            case 1:
                System.out.println ("One");
                break;
            default:
                System.out.println ("Not One");
        }
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