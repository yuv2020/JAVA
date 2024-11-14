package Recursion;

// checking the array to be sorted in increasing order

import java.util.Scanner;  // importing Scanner class for user input

public class sorted {
    public static boolean isSorted(int[] arr, int n) {
        if(n == arr.length-1){
            return true;
        }
        if(arr[n] < arr[n+1]){
            return isSorted(arr, n+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the no. of array to be printed: ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements: ");
        // int i = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }  
        
        sc.close();
        if(isSorted(arr, 0)){
            System.out.println("The array is sorted");
            }
            else{
                System.out.println("The array is not sorted");
        }
        

    } 
    
}
