import java.util.Scanner;

class Main {

    public static void invTriangleWall (int s) {
        for (int i = s; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
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
            invTriangleWall (s);
        }
        scanner.close ();
    }
}