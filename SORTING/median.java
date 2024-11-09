package SORTING;

// Find the median of two sorted array
import java.util.*;

public class median {
    public static double find_median(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        if(n1>n2){
            return find_median(arr2,arr1);
        }

        int low=0, high=n1;
        while(low<=high){
            int partitionX = low + (high-low)/2;
            int partitionY = (n1+n2+1)/2 - partitionX;

            int maxleft1 = (partitionX == 0) ? Integer.MIN_VALUE : arr1[partitionX-1];
            int minright1 = (partitionX == n1) ? Integer.MAX_VALUE : arr1[partitionX];

            int maxleft2 = (partitionY == 0) ? Integer.MIN_VALUE : arr2[partitionY-1];
            int minright2 = (partitionY == n2) ? Integer.MAX_VALUE : arr2[partitionY];

            if(maxleft1 <= minright2 && maxleft2 <= minright1){
                if((n1+n2)%2==0){
                    return (Math.max(maxleft1, maxleft2) + Math.min(minright1, minright2)) / 2.0;
                }

                else{
                    return Math.max(maxleft1, maxleft2);
                }
            }

            else if(maxleft1>minright2){
                high = partitionX-1;
            }
            
            else{
                low = partitionX+1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted properly");


    }

    public static void main(String args[]){
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 40, 6, 8, 10};

        System.out.println("Median " + find_median(arr1, arr2));

    }
    
}
