package Hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

//Example of using HashMap in Java
public class Hashmap {
    public static  void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        
        //Adding elements to HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        //Printing the HashMap
        System.out.println("HashMap: " + map);

        map.put("Two", 180);
        map.put("fortune", 67);
        System.out.println("Updated HashMap: " + map);

        //Search operation or lookup operation
        if(map.containsKey("Indo")){
            System.out.println("Key is present in the map");
        }

        else{
            System.out.println("Key is not present in the map");
        }

        //Get the value from the map
        int value = map.get("One");
        System.out.println("The value of the key is: " + value);        //key is present in the map
        System.out.println("The value of the key is not present i.e., " + map.get("Indonesia"));     //key is not present in the map

        int arr[] = {12,34,65};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] +" ");
        }
        System.err.println("");

        for(int val : arr){
            System.out.println(val +" ");
        }

        //Iteration in hashmaps
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println("Key: " + map.get(key));
        }

        //Remove any pair of keys and values from the map
        System.err.println("Original Map: " + map);
        map.remove("Two");
        System.out.println("After removing 'Two': " + map);
    }
    
}
