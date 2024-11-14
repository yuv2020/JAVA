package Recursion;
import java.util.*;

public class hanoi {
    public static void tower(int n, String source, String helper, String target) {
        if(n==1){
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        tower(n-1, source, target, helper);

        System.out.println("Transfer of disk " + n + " from " + source + " to " + helper);

        tower(n - 1, helper, source, target);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        tower(n, "S", "H", "D");


    }

    
}
