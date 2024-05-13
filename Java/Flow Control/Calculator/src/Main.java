//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    public static void utility (int a, int b, int operator) {

        //write your code here
        if ( operator == 1 ) {
            System.out.print (a + b);
        } else if ( operator == 2 ) {
            System.out.print (a - b);
        } else if ( operator == 3 ) {
            System.out.print (a * b);
        } else {
            System.out.print ("Invalid Input");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter two numbers: ");
            int a = scanner.nextInt ();
            int b = scanner.nextInt ();
            System.out.print ("Enter a number equivalent to operator(1-3): ");
            int operator = scanner.nextInt ();
            utility (a, b, operator);
            System.out.println ();
        }
        scanner.close ();
    }
}