package array;

import java.util.*;

// Find the count frequency of each element in an array.

public class frequency {
    public static void freq(int[] arr, int n){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(freqMap.containsKey(arr[i])){
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            }
            else{
                freqMap.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){    
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        int arr[] = {10,56,32, 56, 2 , 12 , 2, 12 ,89, 63};
        int n = arr.length;
        freq(arr, n);

    
    }
    
}
