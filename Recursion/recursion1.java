package Recursion;

import java.util.Scanner;

public class recursion1 {
    public static void printrec(int n){
        if(n == 6){
            return;
        }
        System.out.print(n + " ");
            // printrec(n-1);
            printrec(n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();   
        printrec(n);
    }
    
}
