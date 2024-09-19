package array;

import java.util.*;

public class rc {
    public static void main(String[] args){

        //create the 2d array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array in rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the size of array in cols: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        //input
        //rows
        for(int i=0; i<r; i++){
            //columns
            for(int j=0; j<c; j++){
                System.out.print("Enter element at (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
