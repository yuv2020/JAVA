package Recursion;

// Print keypad combination
import java.util.*;
public class keypad {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printcomb(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }

        char curr = str.charAt(index);

        String s = keypad[curr - '0']; 
        for(int i = 0; i < s.length(); i++){
            printcomb(str, index+1, combination + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        
        printcomb(str, 0, "");

        
    }
    
}
