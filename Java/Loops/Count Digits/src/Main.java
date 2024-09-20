import java.util.Scanner;

class Main {
    public static void countDigits (int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count += 1;
        }
        System.out.print (count);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a positive number: ");
            int n = scanner.nextInt ();
            countDigits (n);
            System.out.println ();
        }
        scanner.close ();
    }
}