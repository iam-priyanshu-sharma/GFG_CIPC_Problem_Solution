import java.util.Scanner;

class Main {
    public static String completeString (String s) {

        //write your code here
        boolean[] present = new boolean[26];

        for (char c : s.toCharArray ()) {
            if ( Character.isLetter (c) ) {
                int index = Character.toLowerCase (c) - 'a';
                present[index] = true;
            }
        }

        for (boolean isPresent : present) {
            if ( !isPresent ) {
                return "False";
            }
        }

        return "True";
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Enter a string: ");
            String s = scanner.nextLine ();
            System.out.println (completeString (s));
        }
        scanner.close ();
    }
}