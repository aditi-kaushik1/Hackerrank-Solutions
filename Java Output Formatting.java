/* Java's System.out.printf function can be used to print formatted output. 

Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. 
The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes. */

//Solution

/* This is Java's formatter syntax. You can find more about it here. In your case, you have 2 parameters, that get formatted.
First s1 which is formatted using %-15s. The % means that what follows is an argument that will be formatted. 
Then follows a - resulting in left alignment. 15 fills the string up to a length of 15 characters (adding spaces at the end). 
Finally the s means, that you are formatting a string.
Second x which is formatted using %03d. Here the 0 is the fill character, meaning that, if necessary, zeros are added. 
The 3 is again the width, meaning the fill character 0 is added as many times as necessary to make it 3 digits long (this time at the beginning). 
Finally d means, that a integer is formatted. 

("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string. 
15s : here 15 denotes the string's minimum field width 15. '0' : pads the extra 0s in the integer. 
3d : here 3 denotes integer's minimum field width 3. %n : prints the new line.*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

    }
}
