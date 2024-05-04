import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = scanner.nextInt ();

        while (t-- > 0) {
            System.out.print ("Enter value of a: ");
            int a = scanner.nextInt ();

            System.out.print ("Enter value of b: ");
            int b = scanner.nextInt ();

            TestClass obj1 = new TestClass (a, b);
            obj1.findMin ();
            System.out.println ();
        }
    }
}

class TestClass {
    int a, b, Min;

    TestClass (int x, int y) {
        this.a = x;
        this.b = y;
        this.Min = Integer.MAX_VALUE;
    }

    public void findMin () {
        int[] results = new int[4];

        try {
            results[0] = Math.multiplyExact (a, b);
        } catch (ArithmeticException e) {
            results[0] = Integer.MAX_VALUE;
        }

        try {
            results[1] = Math.floorDiv (a, b);
        } catch (ArithmeticException e) {
            results[1] = Integer.MAX_VALUE;
        }

        try {
            results[2] = Math.addExact (a, b);
        } catch (ArithmeticException e) {
            results[2] = Integer.MAX_VALUE;
        }

        try {
            results[3] = Math.subtractExact (a, b);
        } catch (ArithmeticException e) {
            results[3] = Integer.MAX_VALUE;
        }

        for (int result : results) {
            Min = Math.min (Min, result);
        }

        System.out.print ("Minimum value after comparing results of all operations is: " + Min);
    }
}