
// Merge the two sorted array without using sorting.
import java.util.*;

public class merge {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArr = new int[n1+n2];

        int i=0, j=0, k=0;

        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                mergedArr[k++] = arr1[i++];
            }
            else{
                mergedArr[k++] = arr2[j++];
            }
        }
        while (i<n1) {
            mergedArr[k++] = arr1[i++];            
        }
        while(j<n2){
            mergedArr[k++]=arr2[j++];
        }
        return mergedArr;
    }
        

    public static void main(String args[]){
        int[] ar1 = {1,2,4,57};
        int[] ar2 = {2,5,7,8,9,21};
        int[] m = mergeArrays(ar1, ar2);
        System.out.println("Merge of two sorted array is " + Arrays.toString(m));
        
    }
    
}
