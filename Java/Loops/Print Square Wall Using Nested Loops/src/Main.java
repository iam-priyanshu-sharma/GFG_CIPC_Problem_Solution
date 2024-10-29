import java.util.Scanner;

class Main {
    public static void squareWall (int s) {
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print ("* ");
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
            squareWall (s);
        }
        scanner.close ();
    }
}