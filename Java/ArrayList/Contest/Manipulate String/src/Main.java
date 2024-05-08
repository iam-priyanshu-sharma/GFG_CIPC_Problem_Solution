import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static String manipulateIt (String s) {

        //write your code here
        ArrayList<Character> characters = new ArrayList<> ();

        for (int i = 0; i < s.length (); i += 2) {
            char ch = s.charAt (i);
            int digit = Character.getNumericValue (s.charAt (i + 1));
            int increment = (ch - 'a' + digit) % 26;
            characters.add ((char) ('a' + increment));
        }

        StringBuilder sb = new StringBuilder ();
        for (char ch : characters) {
            sb.append (ch);
        }

        return sb.toString ();
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();
        scanner.nextLine ();

        while (t-- > 0) {
            System.out.print ("Enter a String with an increment value: ");
            String s = scanner.nextLine ();
            System.out.print ("Resultant String: " + manipulateIt (s));
        }

        scanner.close ();
    }
}