import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class User {
    String name;

    User () {
        this.name = "Default";
    }

    User (String name) {
        this.name = name;
    }
}

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            User user = new User ();
            System.out.println (user.name);

            System.out.print ("Enter a string: ");
            String name = read.readLine ();

            User user2 = new User (name);
            System.out.println (user2.name);
        }
    }
}