
package Recursion;

// Find the first and last occurrence of the string value.
import java.util.*;

public class occurence{
    public static int first = -1 ;
    public static int last = -1;
    public static void findoccurence(String str, int index, char value){
        if(index == str.length()){
            System.out.println("The result of first occurence is: " first);
            System.out.println("The result of last occurence is: " last);
            return;
        }
        char curr = str.charAt(index);
        if(curr == value){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findoccurence(str, index+1, value);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to find its first and last occurrence: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.print("Enter the element to find the first occurence: ");
        String value = sc.nextLine();

        
        
        findoccurence(str, 0, value.charAt(0));

    }
}