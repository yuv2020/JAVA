package Recursion;
import java.util.*;

public class factorial {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
<<<<<<< Tabnine <<<<<<<
/**//+
 * This function generates and prints the Fibonacci sequence up to the nth term.//+
 * The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.//+
 *//+
 * @param a The first term of the Fibonacci sequence.//+
 * @param b The second term of the Fibonacci sequence.//+
 * @param n The number of terms to generate in the Fibonacci sequence.//+
 *//+
 * @return This function does not return a value. It prints the Fibonacci sequence to the console.//+
 *///+
public static void fibo(int a, int b, int n){//+
    if(n==0) return;//+
    int c = a+b;//+
    System.out.print(c + " ");//+
    fibo(b,c,n-1);//+
}//+
>>>>>>> Tabnine >>>>>>>// {"conversationId":"7e7de3ed-cc85-47c6-9627-4d9552439c26","source":"instruct"}
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =scanner.nextInt();

        System.out.println(factorial(n));
    }
    
}
