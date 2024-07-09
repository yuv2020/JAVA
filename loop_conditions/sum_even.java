import java.util.Scanner;

public class sum_even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        
        if (isEven(sum)) {
            System.out.println("The sum number is even.");
        } else {
            System.out.println("The sum number is odd.");
        }
        
        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

