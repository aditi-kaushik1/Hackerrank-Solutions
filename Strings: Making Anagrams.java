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
    public static int makeAnagram(String a, String b) {
        int[] charOfA = new int[26];
        int[] charOfB = new int[26];
        for(int i = 0; i < a.length(); i++)
            charOfA[a.charAt(i) - 'a']++;
        for(int i = 0; i < b.length(); i++)
            charOfB[b.charAt(i) - 'a']++;
        
        int ans = 0;
        for(int i = 0; i < 26; i++) {
            int x = Math.abs(charOfA[i] - charOfB[i]);
            ans += x;
        }
        return ans;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
