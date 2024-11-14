// Implement the sortings using the bubble sort.
import java.util.*;

public class bubble_sort {
    public static void printarr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;  // length of the array

        // Time complexity calculation o(n^2)
        //Bubble sort
        for(int i=0; i<n-1; i++) {  //Outer loop time (n-1)
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap the elements of the array
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }             
            }

        }
        printarr(arr);
    }
    
}
