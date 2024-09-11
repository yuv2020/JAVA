package patterns;

import java.util.Scanner;

public class factorial {
    
    public static void printfactorial(int n){
        if(n<0){
            System.out.print("Invalid number");
            return;
        }
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. for calculate the factorial: ");
        int n = sc.nextInt();
        printfactorial(n);

    }
    
}
