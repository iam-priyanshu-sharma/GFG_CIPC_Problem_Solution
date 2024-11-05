import java.util.Scanner;

class Main {

    static void helloFunction () {
        System.out.print ("Hello");
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        
        while (t-- > 0) {
            helloFunction ();
        }
        scanner.close ();
    }
}