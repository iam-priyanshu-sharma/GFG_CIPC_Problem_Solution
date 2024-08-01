import java.util.Scanner;

class Main {

    public static void arrayTraversal (int[] numbers) {
        for (int number : numbers) {
            System.out.print (number + " ");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter length of the array: ");
            int n = scanner.nextInt ();
            int[] numbers = new int[n];

            System.out.print ("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt ();
            }
            arrayTraversal (numbers);
            System.out.println ();
        }
        scanner.close ();
    }
}
