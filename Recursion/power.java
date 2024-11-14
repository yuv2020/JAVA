package Recursion;

import java.util.*;
public class power {
    public static int calcpower(int x, int n){
        if(n==0)
            return 1;
        else
            return x * calcpower(x, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The power of " + x + " is " + calcpower(x,n));
    }    
}
