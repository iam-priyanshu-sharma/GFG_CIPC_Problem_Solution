import java.util.Scanner;

class Main {
    public static void utility (int d, int n) {
        //write your code here

        int result = (d - n) % 7;
        if ( result < 0 ) {
            result += 7;
        }

        //System.out.print (result);
        switch (result) {
            case 0:
                System.out.print ("Sunday");
                break;
            case 1:
                System.out.print ("Monday");
                break;
            case 2:
                System.out.print ("Tuesday");
                break;
            case 3:
                System.out.print ("Wednesday");
                break;
            case 4:
                System.out.print ("Thursday");
                break;
            case 5:
                System.out.print ("Friday");
                break;
            case 6:
                System.out.print ("Saturday");
                break;
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        while (t-- > 0) {
            System.out.print ("Enter index of day and value of N: ");
            int d = scanner.nextInt ();
            int n = scanner.nextInt ();
            utility (d, n);
            System.out.println ();
        }
        scanner.close ();
    }
}