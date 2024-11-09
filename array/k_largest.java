package array;

import java.util.Random;

// Find the kth largest element from the unsorted array.
public class k_largest {
    public static int kthlargest(int[] arr, int k){
        int n = arr.length;
        return quickselect(arr, 0, n-1, n-k);
    }

    public static int quickselect(int[] arr1, int left, int right, int k){
        if(left == right){
            return arr1[left];
        }
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);

        pivotIndex = partition(arr1, left, right, pivotIndex);
        
        if(pivotIndex == k-1){
            return arr1[pivotIndex];
        }
        else if(pivotIndex > k-1){
            return quickselect(arr1, left, pivotIndex-1, k);
        }
        else{
            return quickselect(arr1, pivotIndex+1, right, k);
        }  
    } 

    public static int partition(int[] arr2, int left, int right, int pivotIndex){
        int pivot = arr2[pivotIndex];
        swap(arr2, pivotIndex, right);
        int storeIndex = left;
        
        for(int i=left; i<right; i++){
            if(arr2[i] > pivot){
                swap(arr2, i, storeIndex);
                storeIndex++;
            }
        }
        
        swap(arr2, storeIndex, right);
        return storeIndex;
    }

    public static int swap(int[] arr3, int i, int j){
        int temp = arr3[i];
        arr3[i] = arr3[j];
        arr3[j] = temp;
        return arr3[j];
    }

    public static void main(String args[]){
        int[] arr = {10, 7, 8, 9, 1, 5};
        int k = 3;
        int kthLargest = kthlargest(arr, k);
        System.out.println("Kth largest element is: " + kthLargest);     

    }

    
}
