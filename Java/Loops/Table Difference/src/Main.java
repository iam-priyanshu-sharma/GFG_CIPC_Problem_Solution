import java.util.Scanner;

class Main {

    public static void difference (int n1, int n2) {
        for (int i = 1; i <= 10; i++) {
            System.out.print (i * n1 - i * n2 + " ");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter 1st number: ");
            int n1 = scanner.nextInt ();
            System.out.print ("Enter 2nd number: ");
            int n2 = scanner.nextInt ();
            difference (n1, n2);
            System.out.println ();
        }
        scanner.close ();
    }
}