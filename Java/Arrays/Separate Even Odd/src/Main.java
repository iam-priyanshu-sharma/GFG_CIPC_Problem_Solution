import java.util.Scanner;

class Main {

    public static int[] evenOdd (int[] numbers) {
        int[] arr = new int[numbers.length];
        int index = 0;
        for (int value : numbers) {
            if ( value % 2 == 0 ) {
                arr[index++] = value;
            }
        }

        for (int value : numbers) {
            if ( value % 2 != 0 ) {
                arr[index++] = value;
            }
        }

        return arr;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases tou want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter length of array: ");
            int n = scanner.nextInt ();
            int[] numbers = new int[n];

            System.out.print ("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt ();
            }

            int[] res = evenOdd (numbers);

            for (int re : res) {
                System.out.print (re + " ");
            }
            System.out.println ();
        }
        scanner.close ();
    }
}