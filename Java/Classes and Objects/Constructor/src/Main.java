import java.util.Scanner;

class User {
    String name;

    User () {
        this.name = "Default";
    }
}

class Main {
    public static void main (String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = ob.nextInt ();
        
        while (t-- > 0) {
            User user = new User ();
            System.out.println (user.name);
        }
    }
}