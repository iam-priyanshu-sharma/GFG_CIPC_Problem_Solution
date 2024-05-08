import java.util.Scanner;

class Main {
    public static String canMakeAnagrams (String s1, String s2) {

        //write your code here   
        int[] count = new int[26];

        for (char c : s1.toCharArray ()) {
            count[c - 'a']++;
        }

        for (char c : s2.toCharArray ()) {
            count[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if ( count[i] < 0 ) {
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
            System.out.print ("Enter 1st string: ");
            String s1 = scanner.nextLine ();

            System.out.print ("Enter 2nd string: ");
            String s2 = scanner.nextLine ();
            System.out.println (canMakeAnagrams (s1, s2));
        }

        scanner.close ();
    }
}