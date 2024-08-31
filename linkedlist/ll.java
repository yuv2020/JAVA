package linkedlist;

// Define the linked list class
public class ll {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a node at the beginning of the list
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end of the list
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Print the list
    public void printlist() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Node temp = head;  
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deletelist(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    // delete last
    public void deletelast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        while(secondlast.next.next != null){
            secondlast = secondlast.next;
        }
            secondlast.next = null; 
    }


    // Main method to test the linked list implementation
    public static void main(String[] args) {
        ll list = new ll();
        list.addfirst("a");
        list.addfirst("b");
        list.addfirst("c");
        list.addfirst("d");
        list.addfirst("e");
        list.printlist(); // This will print the list elements
        list.deletelist();
        list.printlist(); // This will print the list elements after deleting the first node
        list.deletelast();
        list.printlist();
    }
}
