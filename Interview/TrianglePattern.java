package Interview;

public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to increase or decrease the size of the triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
