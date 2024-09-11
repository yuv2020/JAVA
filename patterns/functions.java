package patterns;

import java.util.Scanner;

public class functions {
    public static int addtwo(int x, int y){
        int s = x+y;
        return s;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a = sc.nextInt();
        System.out.println("Enter the second no.");
        int b = sc.nextInt();      
        
        System.out.println("The sum of two digit is " + a  + " + " + b + "= " + addtwo(a, b));
    }
}
