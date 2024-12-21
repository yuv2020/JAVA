package Queue;

public class basic {
    static class queue{
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //Enquque
        public static void add(int data) {
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;            
        }

        //Dequeue
        public static int remove(){
            if(isEmpty()){
                return -1;
            }

            int front = arr[0];
            for(int i = 1; i <rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args){
        queue q = new queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }     
    }
}
