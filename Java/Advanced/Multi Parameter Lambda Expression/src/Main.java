import java.util.Scanner;

interface Add {
    int addParameters (int x, int y);
}

class Main {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        //taking total count of testcases
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter first number: ");
            //taking the first number
            int x = scanner.nextInt ();

            System.out.print ("Enter second number: ");
            //taking the second number
            int y = scanner.nextInt ();

            //calling helperFunction which adds the two number and return the object
            Add a = helperFunction ();

            //calling interface function to print the answer
            System.out.println ("Sum of " + x + " and " + y + ": " + a.addParameters (x, y));
        }
    }

    public static Add helperFunction () {
        return (x, y) -> x + y;
    }
}