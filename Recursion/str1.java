package Recursion;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class str1 {
    public static void reverse(String str, int index) {
        if(index == 0){
            System.out.println(str.charAt(index));
        }
        System.out.print(str.charAt(index));
        reverse(str, index-1);
        // return str;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of characters : ");
        String str = sc.nextLine();
        System.out.print("Reversed string is: ");
        reverse(str, str.length() - 1);
    }
    
}
