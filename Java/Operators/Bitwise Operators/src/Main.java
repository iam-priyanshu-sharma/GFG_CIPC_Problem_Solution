import java.util.Scanner;

class Main {
    public static void utility (int a, int b, int c) {
        //Do a^a below
        int d = a ^ a;
        //Do c^b below
        int e = c ^ b;
        //Do a&b below
        int f = a & b;
        //Do c|(a^a) below
        int g = c | (a ^ a);
        //Do ~e below
        e = ~e;

        //The line below prints the output. Don't change it!
        System.out.println (d + " " + e + " " + f + " " + g);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter value of a, b and c: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            int c = scanner.nextInt ();
            utility (a, b, c);
        }
        scanner.close ();
    }
}