package arrays_arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.*;

public class max {
    public static void main(String[] args){
        int[] arr = {1, 232, 23, 1490, 5,90,21,455, 1231};
        System.out.println("Original array is: " + Arrays.toString(arr));
        // max_value(arr);
        // System.out.println("Max value from array is: " + max_value(arr));

        System.out.println("Max value from array of range is: " + max_range(arr, 2, 5));

    }

    //Work on the edge cases where array is empty or null
    public static int max_range(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }

        if(arr == null || arr.length == 0){
            return -1;
        }
        
        int max_value = arr[start];
        for(int i=start; i<end; i++){
            if(arr[i] > max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }

    public static int max_value(int[] arr){
        int max_value = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }
    
}
