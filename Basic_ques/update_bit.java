package Basic_ques;
import java.util.*;

public class update_bit {
    
    // Function to update the bit at a given position in a number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation to update the bit at a given position: ");
        int operation = sc.nextInt();  // operation = 1 : set operation = 0 : clear operation 

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Enter the position: ");
        int pos = sc.nextInt();

        if(operation == 1){
            int bitmask = 1<<pos;
            int updatedNum = bitmask | num;
            System.out.println("The update bit at given position is : " + updatedNum);
        }       
        else if(operation == 0){
            int bitmask = ~(1<<pos);
            int updatedNum = bitmask & num;
            System.out.println("The update bit at given position is : " + updatedNum);
        }

    }
    
}
