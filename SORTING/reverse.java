package SORTING;

// Reverse the singly linked list 
import java.util.*;

public class reverse {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addfirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printfirst(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public void reversed(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    public static void reverseArray(int[] arr) {
        reverse r = new reverse();

        r.addfirst(1);
        r.addfirst(2);
        r.addfirst(6);
        r.addfirst(4);
        r.addfirst(50);
        r.addfirst(6);

        System.out.print("Original List");
        r.printfirst();

        r.reversed();

        System.out.print("Reverse List");
        r.printfirst();

        
    }
        
    
}
