package arrays_arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class swap {
    public static void main(String[] args) {
        int[] array = {13,12,43,12,43,132,765};
        System.out.println("Original Array is: " + Arrays.toString(array));

        swap(array, 1, 2);
        System.out.print("Updated Array is: " + Arrays.toString(array));
        // printArray(array);
        
        System.out.println("");
        
        reverse(array);
        System.out.println("reverse the array : " + Arrays.toString(array));
        

    }

    public static void reverse(int[] array){
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
        
        // Sort the array in descending order
        // Arrays.sort(array, Collections.reverseOrder());
        
        // System.out.println("Reversed Array: " + Arrays.toString(array));
    }
    

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
