import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main (String[] args) throws IOException {

        //Reading input using BufferedReader
        BufferedReader read = new BufferedReader ((new InputStreamReader (System.in)));

        System.out.print ("Enter number of test cases you want to perform: ");
        //taking total count of testcases
        int t = Integer.parseInt (read.readLine ());

        while (t-- > 0) {
            System.out.print ("Enter the string: ");
            //Reading the String
            String str = read.readLine ();

            //Calling countWords() method of class WordCount and printing the result
            System.out.println ("Number of words in the given string: " + WordCount.countWords (str));

        }
    }
}

class WordCount {
    public static int countWords (String str) {
        // find and return the number of words present in the string
        String[] words = str.split ("\\s+");
        return words.length;
    }
}