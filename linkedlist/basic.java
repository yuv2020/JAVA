package linkedlist;

// Define the linked list class

public class basic {
    Node head;
    private int size;
    public basic() {
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Two types of add operations i.e., add first and aadd last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add last node 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    //Delete first node of linked list
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last node of linked list
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        Node tempNode = head.next;
        while(tempNode.next!= null){
            tempNode = tempNode.next;
            temp = temp.next;
        }
        temp.next = null;
    }

    //Print the linked list of nodes
    public void printList(){
        if(head == null){
            System.out.println("List is empty ");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Get the size of linked list
    public int getsize(){
        return size;
    }

    public static void main(String[] args) {
        basic list = new basic();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        list.printList(); // This will print the list elements

        list.addLast("f");
        list.addLast("g");
        list.printList(); // This will print the list elements after adding last node

        list.deleteFirst();
        list.printList(); // This will print the list elements after deleting the first node

        list.deleteLast();
        list.printList(); // This will print the list elements after deleting the last node

        System.out.println("The size of linked list is: " + list.getsize());
        
    }
}
