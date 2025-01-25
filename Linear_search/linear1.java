package Linear_search;

import java.util.Arrays;

public class linear1 {
    public static void main(String[] args){
        System.out.print("Original Array is: ");
        int[] arr = {22, 41, 61, 8, 10, 12};
        int target = 10;
        System.out.println(Arrays.toString(arr));

        int index = linearSearch(arr, target);
        System.out.println("The target element is found at index: " + index);

    }    
    //Search the array: return the index if item found
    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0) return -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) return i;
        } 
        return -1;       
    }
}
