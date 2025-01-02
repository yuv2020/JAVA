package array;

//Rearrange array in increasing-decreasing order

import java.util.Arrays;
public class increase {
    public static void main(String[] args){
        int arr[] = {8,7,1,6,5,9};
        // int[] newArr = new int[arr.length];
        int l = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i<l/2; i++){
            System.out.println(arr[i] + "");
        }
        for(int i=l-1; i>=l/2; i--){
            System.out.println(arr[i] + "");
        }
    }    
}
