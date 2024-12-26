package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String args[]){
        //Creating the hash set for the given string
        HashSet<Integer> hs = new HashSet<>();

        //Insert
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);

        //Display
        if(hs.contains(10)){
            System.out.println("contains element ");
        }

        if(!hs.contains(8)){
            System.out.println("not contain this element ");
        }

        //Size of the element
        System.out.println("Size of the HashSet: " + hs.size());

        //Print all the elements of the set
        System.out.println("HashSet: " + hs);

        //Delete the element
        hs.remove(40);
        //Display
        if(!hs.contains(40)){
            System.out.println("element deleted successfully");
            System.out.println("After deletion: " + hs);
        }        

        //Iterator
        Iterator<Integer> itr = hs.iterator();      
        //There are two functions of the iterator that is hashNext and next
        System.out.println("Iterator: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
