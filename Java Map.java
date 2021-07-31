/* while (scan.hasNext()) {  
            System.out.println(scan.next());  
        }  
 hasNext() Method

hasNext() method is used to check whether there is any element remaining in the List. 
This method is a boolean type method that returns only true and false as discussed as it is just used for checking purposes. 
The hasNext() methods of the Iterator and List Iterator returns true if the collection object over which is used to 
check during traversal whether the pointing element has the next element. 
If not it simply returns false.

// Java program to demonstrate
// the use of hasNext() method

// Importing java input output classes
// Importing all classesfrom
// java.util package
import java.io.*;
import java.util.*;

// Class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an ArrayList
		// Declaring the ArrayList
		ArrayList<String> list = new ArrayList<String>();

		// Adding (appending) new elements at
		// the end of the List
		// Custom inputs
		list.add("Geeks");
		list.add("for Geeks");

		// Declaring the Iterator
		Iterator<String> iterator = list.iterator();

		// Printing hasNext() values
		// Prints true because iterator has two more values
		System.out.println(iterator.hasNext());

		// Go to next value using next() method
		iterator.next();

		// Prints true because iterator has one more values
		System.out.println(iterator.hasNext());

		// Go to next value using next() method
		iterator.next();

		// Prints false because iterator has no more values
		System.out.println(iterator.hasNext());
	}
} */

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            map.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(map.containsKey(s))
                System.out.println(s + "=" + map.get(s));
            else
                System.out.println("Not found");
		}
	}
}
