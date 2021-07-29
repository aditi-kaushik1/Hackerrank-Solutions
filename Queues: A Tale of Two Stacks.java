import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public int dequeue() {
        if(stack1.isEmpty() && stack2.isEmpty())
            return -1;
        if(!stack2.isEmpty())
            return stack2.pop();
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.pop();
    }
    
    public void enqueue(int x) {
        stack1.push(x);
    }
    
    public int peek() {
        if(stack1.size() == 0 && stack2.size() == 0)
            return -1;
        if(!stack2.isEmpty())
            return stack2.peek();
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.peek();
    }
}
