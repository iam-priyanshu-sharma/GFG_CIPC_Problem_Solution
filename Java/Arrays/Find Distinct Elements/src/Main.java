import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of test cases you want to perform: ");
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            System.out.print("Enter the size of the matrix: ");
            int N = Integer.parseInt(in.readLine());
            int[][] M = new int[N][N];
            System.out.print("Enter elements of array separated by space: ");
            String[] arr = in.readLine().trim().split("\\s+");
            for (int i = 0; i < N * N; i++) {
                M[i / N][i % N] = Integer.parseInt(arr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}

class Solution {
    int distinct(int[][] M, int N) {
        if (M == null || M.length == 0 || M[0].length == 0) {
            return 0;
        }

        Set<Integer> commonElements = new HashSet<>();
        for (int element : M[0]) {
            commonElements.add(element);
        }

        for (int i = 1; i < N; i++) {
            Set<Integer> currentRowElements = new HashSet<>();
            for (int element : M[i]) {
                currentRowElements.add(element);
            }
            commonElements.retainAll(currentRowElements);
        }
        return commonElements.size();
    }
}
