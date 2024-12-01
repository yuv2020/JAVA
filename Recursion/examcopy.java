package Recursion;

//Copycat in exam
import java.util.*;
public class examcopy {
    public static boolean iscopied(String w1, String w2){
        int l1 = w1.length();
        int l2 = w2.length();

        w1 = w1.toLowerCase();
        w2 = w2.toLowerCase();

        if(l1 != l2){
            return false;
        }

        char[] c1 = w1.toCharArray();
        char[] c2 = w2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : " );
        String w1 = sc.nextLine();
        System.out.println("Enter the string : " );
        String w2 = sc.nextLine();
        System.out.println(iscopied(w1, w2));


    }    
}
