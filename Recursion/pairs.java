package Recursion;

// Find the single or in pairs in a party or function call guest
import java.util.*;
public class pairs {
    public static int callguest(int n){
        if(n<=1){
            return 1;
        } 
        //Single
        int ways = callguest(n-1);

        //In pairs
        int pairs = (n-1) * callguest(n-2);

        return ways + pairs;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of guest : ");
        int n = scanner.nextInt();
        System.out.println("The number of ways to find the single or in pairs in a party or party ");
        System.out.println(callguest(n));
    }    
}
