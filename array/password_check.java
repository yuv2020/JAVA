
// Program to check the strength of password authentication
import java.util.*;
public class password_check{
    public static void main(String[] args){
        String password = "Geeks(hwiys@";
        print_strongest(password);
    }

    public static void print_strongest(String password){
        int l = password.length();
        boolean haslower = false, hasupper = false, hasdigit = false, specialchar = false; 
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '&', '%', '^', '*', '+', '(', ')', '-'));

        for(char ch : password.toCharArray()){
            if(Character.isDigit(ch)){
                hasdigit = true;
            }
            if(Character.isLowerCase(ch)){
                haslower = true;
            }
            if(Character.isUpperCase(ch)){
                hasupper = true;
            }
            if(set.contains(ch)){
                specialchar = true;
            }            
        }

        System.out.println("Strength of passwords: " );
        if(hasupper && specialchar && haslower && hasdigit && (l>=8)) { 
            System.out.println("Strong password ");
        }
        else if((haslower || specialchar || hasupper) && (l>=6)){
            System.out.println("Moderated password");
        }

        else{
            System.out.println("Weak");
        }        
    }

}