/* You are given an unordered array consisting of consecutive integers belongs to [1, 2, 3, ..., n] without any duplicates. 
You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order. */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int minimumSwaps(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
            map.put(arr[i], i);
        int swaps = 0;
        int temp = 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                swaps++;
                temp = arr[i];
                arr[i] = i + 1;
                arr[map.get(i + 1)] = temp;
                map.put(temp, map.get(i + 1));
            }
        }
        return swaps;
        // int count = 0;
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] == i + 1)
        //         continue;
        //     else {
        //         int x = i;
        //         int max = i;
        //         while(arr[arr[x] - 1] != arr[i]) {
        //             x = arr[x] - 1;
        //             max = Math.max(max, x);
        //             count++;
        //         }
        //         i = max;
        //     }  
        // }
        // return (count == 0) ? 0 : count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
