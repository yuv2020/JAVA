package linkedlist;

public class reverse {
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

    // Reverse the linked list
    public void reverse() {
        if(head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node current = head.next;
        while (current != null) {
           Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public Node reverserecursive(Node head) {
        if(head == null || head == null) return null;
        Node newNode = reverserecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        reverse list = new reverse();
        list.addfirst("a");
        list.addfirst("b");
        list.addfirst("c");
        list.addfirst("d");
        list.addfirst("e");
        list.printlist();
        // list.printlist(); // This will print the list elements
        // list.deletelist();
        // list.printlist(); // This will print the list elements after deleting the first node
        // list.deletelast();
        // list.printlist();

        list.reverse();
        list.printlist(); // This will print the reversed list elements

        list.head = list.reverserecursive(list.head);
        list.printlist();
    } 
    
}
