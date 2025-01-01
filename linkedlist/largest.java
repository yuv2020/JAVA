package linkedlist;

import java.util.Arrays;

public class largest {
    public static int largest_element(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[] = {3,2,54,32,67,4};
        System.out.println("Original List is: " + Arrays.toString(arr));
        System.out.println("Max element of the array " + largest_element(arr));
    }
    
}
