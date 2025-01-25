package arrays_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Create an array list
        ArrayList<Integer> list = new ArrayList<Integer>(8);      //Syntax of array list
        
        /* 
        list.add(32);
        list.add(45);
        list.add(3982);
        list.add(90);
        list.add(2132);
        list.add(22);
        list.add(132);
        list.add(321);
        list.add(392);
        
        System.out.println("original list is: "  + list);
        list.set(0,785);

        list.remove(7); // remove function
        System.out.println("Updated: " + list);  // Prints the array list: [32, 45]

        */

        // Using scanner to add elements
        
        for(int i=0; i<4; i++){
            list.add(sc.nextInt(i));
        }

        for(int i =0; i<4; i++){
            System.out.println(list.get(i));
        }

        System.out.println(" ");
    }
}
