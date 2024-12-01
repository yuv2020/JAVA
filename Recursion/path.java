package Recursion;

//Count total paths in a maze to move from (0,0) to (m,n) coordinates.
import java.util.*;
public class path {
    public static int maze(int i, int j, int m, int n) {
        if(i==m || j==n) return 0;

        if(i==m-1  && j==n-1) return 1;
        
        //move downwards
        int down = maze(i+1, j, m, n);

        //move rightwards
        int right = maze(i, j+1, m, n);

        return right + down;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path to the directory: ");
        int m = scanner.nextInt();
        System.out.println("Enter the path to the file: ");
        int n = scanner.nextInt();

        int i=0;
        int j=0;

        System.out.println("The Answer of path of maze is : " + maze(i,j,m,n));

    }
    
}
