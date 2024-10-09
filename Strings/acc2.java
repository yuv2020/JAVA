package Strings;

import java.util.Scanner;

public class acc2 {
    // Find the minimum number of switches you have to press to turn on all bulbs;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        // int l = length.arr;
        int count = 0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        int minSwitches = n - count;
        System.out.println("Minimum number of switches to turn on all bulbs: " + minSwitches);
    }

     
    
}
