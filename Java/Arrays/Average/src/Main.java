import java.util.Scanner;

class Main {

    public static double posAverage (int[] numbers) {
        double sum = 0;
        int count = 0;
        for (int number : numbers) {
            if ( number >= 0 ) {
                sum += number;
                count++;
            }
        }

        return (sum / count);
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
            double avg = posAverage (numbers);
            System.out.println ("Average: " + avg);
        }
        scanner.close ();
    }
}