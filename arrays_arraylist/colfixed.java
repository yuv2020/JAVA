package arrays_arraylist;

public class colfixed {
    public static void main(String[] args) {
        // Declare a 2D array with 3 rows and 4 columns
        int[][] arr = {
            {1,2,34,56,},
            {121,34,2,3,11,56},
            {13, 5, 22,132}
        };

        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();

        }

    }
    
}
