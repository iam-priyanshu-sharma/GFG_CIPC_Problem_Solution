import java.util.Scanner;

class Main {
    public static int arrayLength (int[] numbers) {
        return numbers.length;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter how many numbers you want add in the array: ");
            int n = scanner.nextInt ();
            int[] numbers = new int[n];

            System.out.print ("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt ();
            }
            System.out.println ("Length of the array: " + arrayLength (numbers));
        }
        scanner.close ();
    }
}
