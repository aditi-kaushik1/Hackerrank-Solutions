import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static long candies(int n, List<Integer> arr) {
        if(n == 0)
            return 0;
        int[] left = new int[arr.size()];
        int[] right = new int[arr.size()];
        left[0] = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i - 1))
                left[i] = left[i - 1] + 1;
            else
                left[i] = 1;
        }
        
        right[arr.size() - 1] = 1;
        for(int i = arr.size() - 2; i >= 0; i--) {
            if(arr.get(i) > arr.get(i + 1))
                right[i] = right[i + 1] + 1;
            else
                right[i] = 1;
        }
        
        long count = 0;
        for(int i = 0; i < arr.size(); i++) {
            count += Math.max(left[i], right[i]);
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        long result = Result.candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
