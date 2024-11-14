package Recursion;

import java.util.HashSet;

// Print all the subsequence of all the strings
public class subseq {
    // Function to print all the subsequences of string
    public static void printsub(String string, int index, String newstr, HashSet<String> set){
        if(index == string.length()){
            if(set.contains(newstr)){
                return;  // avoid duplicate subsequences
            }
            else{
                System.out.println(newstr);
                set.add(newstr);  // add newstr to the set to avoid duplicate subsequences.
                return;  // return from the function to avoid printing duplicate subsequences.
            }
            // System.out.println(newstr);
            // return;  // base case when index reaches end of string, print the newstr and return from the function.
        }

        char curr = string.charAt(index);

        //to be
        printsub(string, index+1, newstr+curr, set);

        //not to be
        printsub(string, index+1, newstr, set);

    }

    public static void main(String[] args) {
        String str = "Yuvraj";
        HashSet<String> set = new HashSet<String>();
        printsub(str, 0, "", set);
    }
    
}
