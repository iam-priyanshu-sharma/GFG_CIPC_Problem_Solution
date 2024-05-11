import java.util.Scanner;

class Main {
    public static void utility (String num) {
        //Complete the syntax below. Convert num to int and double it
        int ans = Integer.parseInt (num) * 2;
        System.out.println (ans);
    }

    public static void main (String[] args) {
        Scanner scn = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        //input number of test cases
        int t = scn.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter a number: ");
            //input num
            int num_int = scn.nextInt ();
            String num = Integer.toString (num_int);
            utility (num);
        }
        scn.close ();
    }
}