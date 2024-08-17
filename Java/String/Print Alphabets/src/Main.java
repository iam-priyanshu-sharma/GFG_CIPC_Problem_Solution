import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void alphabets (char c1, char c2) {
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        System.out.print (alphabet.substring (alphabet.indexOf (c1), alphabet.indexOf (c2) + 1));
    }


    public static void main (String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter beginning alphabet: ");
            char c1 = read.readLine ().trim ().charAt (0);
            System.out.print ("Enter ending alphabet: ");
            char c2 = read.readLine ().trim ().charAt (0);

            alphabets (c1, c2);
            System.out.println ();
        }
    }
}
// } Driver Code Ends