package Basic_ques;
import java.util.*;

public class matrix {
    public static void main(String[] args) {
        // int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        // int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = sc.nextInt();
            }
        }

        int search = sc.nextInt();
        boolean found = false;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(ans[i][j] == search){
                    System.out.println(search + " found at index: " + i + ", " + j);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println(search + " not found in the matrix.");
        }
    }
    
}
