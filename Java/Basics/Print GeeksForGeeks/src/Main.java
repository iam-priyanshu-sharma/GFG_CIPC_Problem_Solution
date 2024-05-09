import java.util.Scanner;

class Geeks {

    //comment the line that outputs "Hello World"
    static void print () {

        //Prints Hello World
        // System.out.println ("Hello World");
        //Prints GeeksForGeeks
        System.out.println ("GeeksForGeeks");
    }
}

class Main {

    public static void main (String[] args) {
        //Creating an Object of Scanner class
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter number of test cases you want to perform: ");
        //Getting number of testcases
        int testcase = scanner.nextInt ();

        // Taking input for all testcases
        while (testcase-- > 0) {
            //Calling the comments function of class Geeks
            Geeks.print ();
        }
    }
}