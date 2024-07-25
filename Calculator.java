import java.util.*;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("Choose the operator +, -, *, / ");
        char opr = sc.next().charAt(0);
        
        switch(opr){
            case '+':
                System.out.println("Sum: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Difference: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Product: " + (n1 * n2));
                break;
            case '/':
                if(n2!=0){
                    System.out.println("Division: " + (n1 / n2));
                }
                else{
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
    }
    }
}