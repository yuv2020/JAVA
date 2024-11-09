package SORTING;

//Implement binary search in the sorted array 
import java.util.*;
public class implement {
    public static int binary_search(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                left = mid+1;
            }
            else{
                right = mid - 1; 
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 54, 67, 32, 45, 12, 34, 87};
        int target = sc.nextInt();

        int ans = binary_search(arr, target);
        System.out.println("Element found at index "+ ans);

    }
    
}
