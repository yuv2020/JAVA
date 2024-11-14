package Recursion;

import java.util.*;

public class height {
    public static int high(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        // By using this trick we decrease the power of stack of height (log n).

        if(n%2==0){  // n is even number
            return high(x, n/2) * high(x, n/2);
        }
        else{  // n is odd number number
            return high(x, n/2) * high(x, n/2) * x;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base number: ");
        int n = sc.nextInt();

        System.out.println("Enter the value for power: ");
        int x = sc.nextInt();

        System.out.println("Height of the number " + n + " raised to the power " + x + " is: " + high(n, x));

    }
}
