import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(n-- != 0) {
            int x = sc.nextInt();
            list.add(x);
        }
        
        int q = sc.nextInt();;
        while(q-- != 0) {
            String query = sc.next();
            if(query.equals("Insert")) {
                int index = sc.nextInt();
                int element = sc.nextInt();
                list.add(index, element);
            }
            else {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for(int x : list) {
            System.out.print(x + " ");
        }
    }
}
