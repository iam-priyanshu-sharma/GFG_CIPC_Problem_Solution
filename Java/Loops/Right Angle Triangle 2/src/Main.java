import java.util.Scanner;

class Main {

    public static void triangle (int s) {
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                if ( i == 1 || i == s || j == 1 || j == i ) {
                    System.out.print ("* ");
                } else {
                    System.out.print ("  ");
                }
            }
            System.out.println ();
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter value of s: ");
            int s = scanner.nextInt ();
            triangle (s);
        }
        scanner.close ();
    }
}