import java.util.Scanner;

class Main {
    public static void concatenate (int a, int b) {
        //Complete the code below to concatenate a and b
        String ans = Integer.toString (a) + b;
        //Complete the code above to concatenate a and b
        System.out.println ("Result after Concatenation: " + Integer.parseInt (ans));
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.println ("Enter value of A and B: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            concatenate (a, b);
        }
    }
}