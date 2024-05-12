import java.util.Scanner;

class Main {

    public static void utility (boolean a, boolean b) {
        //Do a AND b below
        boolean p = a & b;
        //Do a OR b below
        boolean q = a | b;
        //Do NOT a below
        boolean r = !a;

        System.out.println ("AND: " + p + "\n" + "OR: " + q + "\n" + "NOT: " + r);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter two boolean value: ");
            boolean a = scanner.nextBoolean ();
            boolean b = scanner.nextBoolean ();
            utility (a, b);
        }
        scanner.close ();
    }
}