import java.util.Scanner;

class Geeks {

    // Function to take input using Scanner class
    static void IOFunction () {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a Integer Value: ");
            int a = scanner.nextInt ();
            System.out.println (a);

            System.out.print ("Enter a Float Value: ");
            float b = scanner.nextFloat ();
            System.out.println (b);

            System.out.print ("Enter a Long Value: ");
            long c = scanner.nextLong ();
            System.out.println (c);

            System.out.print ("Enter a Byte Value: ");
            byte d = scanner.nextByte ();
            System.out.println (d);

            System.out.print ("Enter a String: ");
            scanner.nextLine ();
            String s = scanner.nextLine ();
            System.out.println (s);
        }
    }
}

class Main {
    public static void main (String[] args) {
        //Calling the IOFunction() of class Geeks
        Geeks.IOFunction ();
    }
}