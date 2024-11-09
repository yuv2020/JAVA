// Ritik wants a magic board, which displays a character for a corresponding number for his science project. 
// Help him to develop such an application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
// [Assume the number of inputs should be always 4 ]

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        // Take input from the user and convert the digits to characters.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the digits : ");
        int b = sc.nextInt();
        
        System.out.print("Enter the digits : ");
        int c = sc.nextInt();
        
        System.out.print("Enter the digits : ");
        int d = sc.nextInt();

        char m = (char) a;
        char n = (char) b;
        char o = (char) c;
        char p = (char) d;
        
        System.out.println();
        System.out.print(a);
        System.out.println(" - " + m);

        System.out.print(b);
        System.out.println(" - " + n);
        
        System.out.print(c);
        System.out.println(" - " + o);
        
        System.out.print(d);
        System.out.println(" - " + p);

        System.out.println();


        
        
    }
     
    
}
