package Strings;

import java.util.*;

//Print the first k words of string.
public class acc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        
        System.out.println("Enter the number of words to print: ");
        int k = sc.nextInt();

         
        StringTokenizer t = new StringTokenizer(s); //Use the String Token
        int a = t.countTokens();
        int i=0;
        while(i < k){
            String w = t.nextToken();
            System.out.print(w + " ");
            i++;
        }
        
        // String[] words = s.split(" ");
        
        // printstr(words[0].charAt(0), k);
        // sc.close();
    }

    // public static void printstr(char str, int k){
    //     if(k == 0){
    //         return;
    //     }
        
    //     System.out.print(str);
        
    //     printstr(str, k-1);


    // }

    
}
