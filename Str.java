import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        // System.out.println(sb);

        // System.out.println(sb.charAt(0));  //char at index 0

        // sb.setCharAt(0, 'P');  //set char At index 0

        // System.out.println(sb);  //print the updated string

        //REVERSE THE STRING
        // for(int i=0; i<sb.length(); i++){
        //     System.out.print(sb.charAt(sb.length()-1-i));
        // }

        // OR

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char f = sb.charAt(front);
            char b = sb.charAt(back);

            sb.setCharAt(front, b);
            sb.setCharAt(back, f);
        }

        System.out.println(sb);  //print the reversed string


        
    }
    
}
