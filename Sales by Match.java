/* There is a large pile of socks that must be paired by color. 
Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are. */

public class Main {
  public static int sockMerchant(int n, List<Integer> ar) {
        //Solution 1
        int count = 0;
        int[] arr = new int[256];
        for(int x : ar)
            arr[x]++;
        for(int i = 0; i < 256; i++) {
            if(arr[i] % 2 == 0)
                count += arr[i]/2;
            else
                count += (arr[i] - 1)/2;
        }
        return count;
        
        //Solution 2
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int count = 0;
        // for(int x : ar)
        //     map.put(x, map.getOrDefault(x, 0) + 1);
        // for(int y : map.keySet()) {
        //     if(map.get(y) % 2 == 0)
        //         count = count + (map.get(y)/2);
        //     else
        //         count = count + ((map.get(y) - 1)/2);
        // }
        // return count;
     }
 }
