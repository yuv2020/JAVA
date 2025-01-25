package Linear_search;

import java.util.Arrays;

public class search_2d {
    public static void main(String[] args) {
        int[][] arr = {
                {21,34,11,45},
                {2, 1, 32, 43},
                {3, 45, 6, 14},
                {15, 7, 10, 16}
        };

        int target = 10;
        // System.out.println(Arrays.toString(searchRow(arr, target)));
        System.out.println(max(arr));
    }

    public static int[] searchRow(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{ row, col };
                }
            }
        }
        return new int[]{-1, -1};
    }    

    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] i : arr){
            for(int element : i){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
