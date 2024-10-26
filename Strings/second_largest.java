package Strings;

import java.util.Scanner;

// Find the second largest element in the array.
public class second_largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if(size<2){
            System.out.println("Array must have 2 elements");
            return;
        }
        
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        int res = second_largest(arr);
        System.out.println("the second largest element is " + res); 
        
        
    }    

    public static int second_largest(int[] arr){
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i] > second_max && arr[i]!=max){
                second_max = arr[i];
            }
        }
        return second_max;
    }
}
