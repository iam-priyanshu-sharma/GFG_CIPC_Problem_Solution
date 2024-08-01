import java.util.Scanner;

class Main {

    public static int[] decrementArrayElements (int[] numbers) {
        int[] dec = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            dec[i] = numbers[i] - 1;
        }
        return dec;
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
            
            int[] res = decrementArrayElements (numbers);

            for (int i = 0; i < n; i++) {
                System.out.print (res[i] + " ");
            }
            System.out.println ();
        }
        scanner.close ();
    }
}
