import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter value of A and B: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            Solution oj = new Solution ();
            oj.utility (a, b);
        }
    }
}

class Solution {
    public void utility (int a, int b) {
        //code here
        int c = a;
        a = b;
        b = c;
        System.out.println ("After swapping value of A and B: " + a + " and " + b);
    }
}