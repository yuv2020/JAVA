package array;

import java.util.*;

public class search_rc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array in row: ");
        int r = sc.nextInt();
        System.out.print("Enter the size of array in cols: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        //input
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("Enter element at (" + i + "," + j + "): ");
                arr[i][j] = sc.nextInt();
            }
            
        }
        System.out.print("Enter the no. to be searched: ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.println(arr[i][j] + " ");
            }                   
        }

        System.out.println();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == x){
                    System.out.println(x + " Found at location (" + i + ", " + j + ") ");
                }
            }
        }
    }
    
}
