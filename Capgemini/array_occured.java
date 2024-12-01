package Capgemini;

import java.util.*;

public class array_occured {
    public static void countoccur(int[] arr){
        Map<Integer, Integer> occured = new HashMap<Integer, Integer>();

        //Count occcurence of the integer
        for(int n : arr){
            occured.put(n, occured.getOrDefault(n, 0) + 1);
        }

        // Print the occurences of the integer
        for (Map.Entry<Integer, Integer> entry : occured.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Occurrence: " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Occurences of each element ");
        countoccur(arr);

    }
    
}
