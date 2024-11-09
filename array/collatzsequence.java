package array;

//Program to print Collatz Sequence

// Starting with any positive integer N, Collatz sequence is defined corresponding to n as the numbers 
//formed by the following operations :
 

// If n is even, then n = n / 2.
// If n is odd, then n = 3*n + 1.
// Repeat above steps, until it becomes 1.

import java.util.Scanner;
import java.util.*;
public class collatzsequence {
    public static int task1(int n){
        while(n!=1){
            System.out.print(n + " ");
            if((n&1)==1){
                n = 3 * n + 1; 
            }
            else{
                n/=2;
            }
        }
        // System.out.println(n); 
        return n;    
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        System.out.print(task1(n));

    }    
}
