package arrays_arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* It is in the matrix form 2d array

         1 2 3 4 
         2 3 4 5
         6 7 8 9

         */

        /* int[][] arr = new int[3][3];

        int[][] arr2d = {
            {1, 2, 3},  //0th index 
            {2, 3},     //1st index 
            {4, 6, 7, 8}    //2nd index -> arr[2][0] ->> output is 4
        };

        */

        //Input
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr.length; col++){
                arr[row][col] = sc.nextInt();
                // System.out.print(arr[row][col] + " ");
            }
        }

        //Output
        /*for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr.length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        } */


        /*
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
            */


        // We can perform the array in this form
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        

    }
}
