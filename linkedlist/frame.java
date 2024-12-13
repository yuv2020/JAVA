package linkedlist;

import java.util.*;
//Frame works of java

public class frame {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.addFirst("a");
        ll.addFirst("is");
        System.out.println("The linked list is: " + ll);

        ll.addFirst("this");
        ll.addLast("example");
        System.out.println("After adding elements: " + ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println("NULL");

        ll.removeFirst();
        System.out.println("After removing first element: " + ll);

        ll.remove(2);
        System.out.println("After removing at index element: " + ll);

        
    }
}
