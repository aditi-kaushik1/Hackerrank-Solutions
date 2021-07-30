/* Complete the minimumAbsoluteDifference function in the editor below. 
It should return an integer that represents the minimum absolute difference between any pair of elements.
minimumAbsoluteDifference has the following parameter(s):
int arr[n]: an array of integers
Returns
int: the minimum absolute difference found */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        //Solution 1
        //Time complexity : O(n^2)
        //Time limit exceeded
        
        // if(arr.size() == 0)
        //     return 0;
        // if(arr.size() == 1)
        //     return arr.get(0);
        // Collections.sort(arr);
        // int min = Integer.MAX_VALUE;
        // for(int i = 0; i < arr.size() - 1; i++) {
        //     for(int j = i + 1; j < arr.size(); j++) {
        //         min = Math.min(min, Math.abs(arr.get(j) - arr.get(i)));
        //     }
        // }
        // return min;
        
        //Solution 2
        //Time complexity : O(nlogn)
        
        if(arr.size() == 0)
            return 0;
        if(arr.size() == 1)
            return 1;
        int min = Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i = 0; i < arr.size() - 1; i++) {
            min = Math.min(min, arr.get(i + 1) - arr.get(i));
        }
        return min;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
