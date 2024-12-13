package linkedlist;

//Linked list is palindrome or not
import java.util.*;

public class ll_palindrome {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr!=null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
            
        return prev;
    }

    public ListNode findmiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    public ListNode ispalindrome(ListNode head){
        if(head == null || head.next==null){
            return true;
        }
        
        ListNode middle = findmiddle(head);  // 1st half of the end
        ListNode secondhalflast = reverse(middle.next);

        ListNode firsthalflast = head;
        while(secondhalflast.val != null){
            if(firsthalflast.val!=secondhalflast.val){
                return false;
            }
            firsthalflast = firsthalflast.next;
            secondhalflast = secondhalflast.next;
        }
        return true;
    }
    public static void main(String[] args){

    }
    
}
