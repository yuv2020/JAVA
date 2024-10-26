package Strings;

import java.util.Scanner;
public class missing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        System.out.println("Enter the elements of the array:");
        for(int i=1; i<n-1; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Missing number in the array is: "+missing(arr,n));
    }

    public static int missing(int[] arr, int n) {
       int expectedsum = n*(n+1)/2;
       int actualsum = 0;
       
       for(int num : arr){
            actualsum+=num;
        }

        return expectedsum - actualsum;

    }
    
}
