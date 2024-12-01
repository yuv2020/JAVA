package arraylist;

//Declare the arraylist and collection package
import  java.util.ArrayList;
import java.util.Collections;

public class array {
    public static void main(String[] args) {
        // Create an arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //Get elements
        int element = list.get(0);
        System.out.println("Element at index one : " + element);

        //Add element in between
        list.add(1, 5);
        System.out.println("Updated list: " + list);

        //Set element
        list.set(0, 6);
        System.out.println("Updated list: " + list);

        //Remove element
        list.remove(2);
        System.out.println("Updated list: " + list);

        //Size of the list
        list.size();
        System.out.println("Size of the list: " + list.size());

        //loops through the list
        for(int i=0; i<list.size(); i++){
            System.out.println("Element at index " + i + " : " + list.get(i));
        }
        System.out.println("");

        //Sorting function
        Collections.sort(list);
        System.out.println("Sorted list: " + list);


    }
}
