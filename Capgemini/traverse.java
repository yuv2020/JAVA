package Capgemini;

//Traverse a spiral matrix 

import java.util.Scanner;


public class traverse {
    
    //Function to print the spiral order of matrix
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right=cols-1;
        while(top<=bottom && left<=right){

            // Traverse from left to right
            for(int i=left; i<=top; i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
        

            // Traverse from top to bottom
            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;

            // Traverse from right to left
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }

            // Traverse from bottom to top
            if(right<=left){
                for(int i=bottom; i>=top; i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;            
            }    
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of a matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of a matrix: ");  
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        
        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral matrix is: ");
        
        printSpiral(matrix, rows, cols);

    }
    
}
