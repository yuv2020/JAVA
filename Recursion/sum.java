package Recursion;

import java.util.*;

//sum of n numbers
public class sum {
    public static void sumN(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println("Sum of " + n + " numbers is: " + sum);
            return;
        }     
        sum+=i;
        sumN(i+1, n, sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        sumN(1, n, sum);
    }
    
}
