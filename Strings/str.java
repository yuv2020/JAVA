package Strings;

import java.util.*;

public class str{
    public static void main(String[] args) {
        // String str = "Hello ";
        // System.out.print("Enter your name: ");
        // Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println(str + name + '!');

        // //concatenation

        // String n = name.substring(1, name.length());

        // System.out.println(n);

        // StringBuilder sb = new StringBuilder("rajiv");
        // System.out.println(sb);

        // //char at index 0.
        // System.out.println(sb.charAt(0));

        // //set char at index 0.
        // sb.setCharAt(0, 'P');
        // System.out.print(sb);
        // System.out.println();

        // // using the insert command  java.
        // sb.insert(0, 'H');
        // System.out.print(sb);

        //reverse a string

        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        // System.out.println(sb);
        // System.out.println();

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char f = sb.charAt(front);
            char b = sb.charAt(back); 

            sb.setCharAt(front, b);
            sb.setCharAt(back, f);
        }
        System.out.println(sb);
    }
}