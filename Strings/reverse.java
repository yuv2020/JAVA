package Strings;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(str));


    }

    public static String reverseString(String str){
        // StringBuilder sb = new StringBuilder(str);
        // return sb.reverse().toString();

        String rev = "";

        for(int i = str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
}
