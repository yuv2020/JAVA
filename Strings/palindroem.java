package Strings;

// Check the strng is a palindrome or not.

import java.util.*;
public class palindroem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if(ispalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }

    }

    public static boolean ispalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
