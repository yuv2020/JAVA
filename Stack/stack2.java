package stack;

import java.util.ArrayList;
import java.util.List;

public class stack2 {
    static class stack_ll{
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty(){
            return list.isEmpty();
        }

        // Push the elements of the array
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stack_ll s = new stack_ll();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
