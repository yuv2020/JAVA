package Strings;

import java.util.*;

// check the two string are anagrams or not.
public class Anagrams {
    public static boolean str_anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        return Arrays.equals(ar1, ar2);

    }
    public static void main(String[] args) {
        String s1 = "heart";
        String s2 = "silent";

        if(str_anagram(s1,s2)){
            System.out.println(s1 + " and " + s2 + " are " + "anagrams");
        }
        else{
            System.out.println(s1 + " and " + s2 + " are not " + "anagrams");
        }
    }

}
