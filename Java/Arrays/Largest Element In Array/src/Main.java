import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class IntArray {
    public static int[] input (BufferedReader br, int n) throws IOException {
        System.out.print ("Enter elements of array separated by space: ");
        String[] s = br.readLine ().trim ().split (" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt (s[i]);

        return a;
    }
}

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (br.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter length of array: ");
            int n = Integer.parseInt (br.readLine ());

            int[] arr = IntArray.input (br, n);

            Compute obj = new Compute ();
            int res = obj.largest (arr, n);

            System.out.println ("Largest element in the array: " + res);
        }
    }
}

class Compute {
    public int largest (int[] arr, int n) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if ( arr[i] > largest ) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
