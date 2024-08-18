import java.util.Scanner;

class MyClass {
    public void display () {
        System.out.println ("Hello World");
    }
}

class Main {
    public static void main (String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = ob.nextInt ();

        while (t-- > 0) {
            MyClass obj = new MyClass ();
            obj.display ();
        }
    }
}