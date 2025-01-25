
package Linear_search;

import java.util.Arrays;
public class search_string {
    public static void main(String[] args) {
        String name = "Kunlang";
        char target = 'z';

        System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.print(search2(name, target));
    }
/*
    public static boolean search2(String string, char target){
        if(string.length() == 0) return false;
        
        for(char ch : string.toCharArray()){
            if(ch == target) return true;
        }

        return false;
    }

    // public static boolean search(String str, char target) {
    //     if(str.length() == 0) return false;

    //     for(int i=0; i<str.length(); i++) {
    //         if(str.charAt(i) == target) return true;
    //     }
    //     return false;
    // }

*/
    
}
