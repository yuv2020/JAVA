package stack;

import java.util.Stack;
public class frame_collection {
    public static void main(String[] args) {
        //Use the stack java frame work collection
        Stack<Integer> stack = new Stack<Integer>();
        
        // Pushing 5 elements into the stack    
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
        // // Printing the size of the stack
        // System.out.println("Size of the stack: " + stack.size());
        
        // // Printing the top element of the stack
        // System.out.println("Top element of the stack: " + stack.peek());
        
        // // Popping elements from the stack
        // System.out.println("Popped element: " + stack.pop());
        // System.out.println("Popped element: " + stack.pop());
        
        // // Printing the size of the stack after popping elements
        // System.out.println("Size of the stack: " + stack.size());

    }
    
}
