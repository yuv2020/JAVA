package Capgemini;

import java.util.*;

public class len {
    public static void movehash(String string, int n){
        int len = string.length();

        String s1 = new String("");
        String s2 = new String("");

        int i=0;
        for(i=0; i<n; i++){
            if(string.charAt(i) == '#'){
                s1+=string.charAt(i);
            }

            else{
                s2+=string.charAt(i);
            }
        }

        String ans = s1.concat(s2);
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        movehash(str, n);
        

    }
    
}
