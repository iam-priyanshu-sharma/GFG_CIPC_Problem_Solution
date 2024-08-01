import java.util.Scanner;

class Main {
    public static void arrayTraversalReverse (int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print (numbers[i] + " ");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter length of array: ");
            int n = scanner.nextInt ();
            int[] numbers = new int[n];

            System.out.print ("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt ();
            }
            arrayTraversalReverse (numbers);
            System.out.println ();
        }
        scanner.close ();
    }
}