import java.util.Scanner;

class Main {
    public static void utility (int y) {
        String isLeap = "False";

        //Your code below
        //Assign True or False to isLeap
        if ( y % 4 == 0 ) {
            if ( y % 100 == 0 ) {
                if ( y % 400 == 0 ) {
                    isLeap = "True";
                } else {
                    isLeap = "False";
                }
            } else {
                isLeap = "True";
            }
        } else {
            isLeap = "False";
        }
        //Your code above

        //The line below prints the output
        System.out.println (isLeap);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter a year: ");
            int y = scanner.nextInt ();
            utility (y);
        }
        scanner.close ();
    }
}