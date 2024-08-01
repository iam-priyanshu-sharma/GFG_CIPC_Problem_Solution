import java.util.*;

class Solution {
    boolean arraySortedOrNot(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            System.out.print("Enter the elements of the array separated by space: ");
            String line = scanner.nextLine();
            String[] numStrings = line.split(" ");
            int[] nums = new int[numStrings.length];
            for (int i = 0; i < numStrings.length; i++) {
                nums[i] = Integer.parseInt(numStrings[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.arraySortedOrNot(nums);
            System.out.println(ans ? "true" : "false");
        }
        scanner.close();
    }
}
