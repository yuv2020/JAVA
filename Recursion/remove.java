package Recursion;

// Remove duplicates from the string
import java.util.*;

public class remove {
    public static boolean[] map = new boolean[26];

    public static void duplicates(String str, int index, String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        
        char curr = str.charAt(index);

        if(map[curr - 'a']){
            duplicates(str, index + 1, newstr);
        }
        else{
            newstr+=curr;
            map[curr - 'a'] = true;
            duplicates(str, index + 1, newstr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int index = 0;
        System.out.print("After removing duplicates: ");

        duplicates(str, index, "");
    }    
}
