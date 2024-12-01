package Capgemini;

// reduce the size of this string using mathematical logic
import java.util.*;

public class reduce {
    public static String reduceString(String str) {
        if(str==null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length()-1)).append(count);
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println(reduceString(str));
        
    }
    
}
