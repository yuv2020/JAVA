package array;

//Find no. of duplicates in an array

import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class duplicate {
    public static List<Integer> find_duplicate(int[] arr){
        
        List<Integer> ans = new ArrayList();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    if(!ans.contains(arr[i])){
                        ans.add(arr[i]);
                    }

                    break;
                }
            }
        }
        return ans;

    }
    
    
    public static void main(String args[]){
        int[] arr = {1,2,45,67,45,32,55,43,2,1,56,89};
        List<Integer> duplicates = find_duplicate(arr);
        System.out.println("Duplicate elements are: " + duplicates);


    }

}
