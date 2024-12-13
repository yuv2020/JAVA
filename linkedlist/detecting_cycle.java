package linkedlist;

//Detecting a cycle in linked list
// Floyd's algorithm to detect cycles in the linked list or hare, turtle linked list

public class detecting_cycle {
    public ListNode boolean hascycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode hare = head;  //fast
        ListNode tortoise = head;  //slow

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == tortoise){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

    }
    
}
