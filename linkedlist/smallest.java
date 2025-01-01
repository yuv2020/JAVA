package linkedlist;
// Java program to find the smallest element in an array

import java.util.*;

public class smallest {
    public static int smallest_element(int arr[]){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }
    public static void main(String[] args){
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println("Original String is " + Arrays.toString(arr));
        System.out.println(smallest_element(arr));
    }
}