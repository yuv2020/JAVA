package arrays_arraylist;

import java.util.ArrayList;

import java.util.Arrays;
public class passinginfuctions {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        printArray(numbers);
        
        System.out.println("Modified array: " + Arrays.toString(numbers));
    }

    static void printArray(int[] arr) {
        arr[0] = 90;
    }
    
}
