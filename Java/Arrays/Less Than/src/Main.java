import java.util.Scanner;

class Main {

    public static int[] lessThan (int[] numbers, int k) {
        int count = 0;
        for (int value : numbers) {
            if ( value < k ) {
                count++;
            }
        }

        int[] arr = new int[count];
        int index = 0;
        for (int value : numbers) {
            if ( value < k ) {
                arr[index++] = value;
            }
        }
        return arr;
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

            System.out.print ("Enter a number: ");
            int k = scanner.nextInt ();
            int[] res = lessThan (numbers, k);

            for (int re : res) {
                System.out.print (re + " ");
            }
            System.out.println ();
        }
        scanner.close ();
    }
}