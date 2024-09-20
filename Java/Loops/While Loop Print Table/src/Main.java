import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            int n = scanner.nextInt ();
            Geeks.printTable (n);
        }
    }
}

class Geeks {
    static void printTable (int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            System.out.print (multiplier * n + " ");
            multiplier--;
        }
        System.out.println ();
    }
}