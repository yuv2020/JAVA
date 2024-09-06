package patterns;

public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // inner loop for stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // reverse the pattern for the second half
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
