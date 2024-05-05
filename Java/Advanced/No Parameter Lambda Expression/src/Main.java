import java.util.Scanner;

interface Hello {
    void sayHello ();
}

class Main {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");

        //taking testcases count
        int t = scanner.nextInt ();

        while (t-- > 0) {
            //calling helperFunction of class Hello
            Hello h = helperFunction ();

            //calling Interface method
            h.sayHello ();
        }
    }

    public static Hello helperFunction () {
        return () -> System.out.println ("Hello");
    }
}