package linkedlist;

import java.util.*;

public class imp_ques {
    //Find the nth node from the last node
    public ListNode removenth(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        int size = 0;
        ListNode prev = head;
        while(prev != null){
            prev = prev.next;
            size++;
        }

        if(n == size){
            return head.next;
        }
        int index = size-n;
        prev = head;
        int i = 1;
        while(i<index){
            prev = prev.next;
            i++;
        }
        prev =  prev.next.next;
        return head;
    }


    public static void main(String[] args) {
    }
    
}
