package Basic_ques;
import java.util.Scanner;

public class ncuts {

    public static int max_cuts(int n){
        int ans = n/2;

        return ((ans+1) * (n - ans + 1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The square is cut in " +  max_cuts(n) + " parts");
    }
    
}
