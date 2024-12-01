package Recursion;

import java.util.Scanner;

//Print all permutations of the strings.

public class permutation {
    public static void printpermutation(String str, String p){
        if(str.length() == 0){
            System.out.println(p);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);

            printpermutation(newstr, p+curr);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String for permutation: ");
        String s = sc.nextLine();
        System.out.print("After permutation of the string " + s +" is : ");
        printpermutation(s, "");

    }
    
}
