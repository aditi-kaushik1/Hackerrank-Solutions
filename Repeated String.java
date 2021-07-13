/* There is a string, , of lowercase English letters that is repeated infinitely many times. 
Given an integer, find and print the number of letter a's in the first  letters of the infinite string. */

 public static long repeatedString(String s, long n) {
        int count = 0;
        int remCount = 0;
        long x = n % s.length();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a')
                count++;
            if(ch == 'a' && i < x)
                remCount++;
        }
        long multiply = n/s.length();
        return (count * multiply) + remCount;
    }
