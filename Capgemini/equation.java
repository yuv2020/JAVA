package Capgemini;

// function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2 + b3.

import java.util.Scanner;


public class equation {
    public static double calculate(double a, double b){
        return Math.pow(a+b, 3);
    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();

        double result = calculate(a, b);
        System.out.println("The result is: " + result);

        

    }
    
}
