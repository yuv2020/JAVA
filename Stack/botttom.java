package stack;

//Push the elements to the bottom of the stack
import  java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class botttom {
    public static void pushatbottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushatbottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pushatbottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(1);  
        stack.push(2);
        stack.push(3);
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the number to be pushed : ");
        // int data = scanner.nextInt();
        
        // pushatbottom(data, stack);

        reverse(stack);
        
        while(!stack.isEmpty()){
            System.out.println(stack.peek() + " ");
            stack.pop();
        }

    }    
}
