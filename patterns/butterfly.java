package patterns;

import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        int n = 5;
        
        //upper half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){ //1st part
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){ //1st part
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    
}
