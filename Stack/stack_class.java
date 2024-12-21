package stack;

public class stack_class {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class stack{
        public static Node head;
        public static boolean isempty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isempty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isempty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int popped = head.data;
            head = head.next;
            return popped;
        }
        public static int peek(){
            if(isempty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
