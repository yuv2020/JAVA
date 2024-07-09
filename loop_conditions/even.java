import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (isEven(number)) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
