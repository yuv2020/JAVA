import java.util.*;

public class theater {
    public static void main(String args[]){
        double total = 0, cost;

        String ref, code, circle;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no. of tickets: ");

        int n = sc.nextInt();

        if(n < 5 || n > 40){
            System.out.println("Minimum of 5 and Maximum of 40 tickets: ");
            System.exit(0);
        }

        System.out.print("Do you need refreshment: ");
        ref = sc.next();

        System.out.print("Do you need Coupon Code: ");
        code = sc.next();

        System.out.print("Enter the Circle: ");
        circle =sc.next();

        if(circle.charAt(0) == 'k'){
            cost = 75 * n; 
        } 

        else if(circle.charAt(0) == 'q'){
            cost = 150 * n;
        }

        else{
            System.out.print(" Invalid Output: ");
            return;
        }

        total = cost;
        if(n>20){
            cost-=(0.1*cost);
            total = cost;
        }
        if(code.charAt(0) =='y'){
            total = cost - (0.02 * cost);
        }

        if(ref.charAt(0) == 'y'){
            total += (n * 50);
            System.out.format("Ticket cost:%.2f: ", total);
        }
    }    
}
