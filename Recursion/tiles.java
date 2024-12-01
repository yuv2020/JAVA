package Recursion;

// Place the tiles of size 1*m in a floor n*m tile

import java.util.*;

public class tiles {
    public static int placetiles(int n, int m) {
        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;
        }

        //vertically
        int vertical = placetiles(n-m, m);

        //horizantally
        int horizontal = placetiles(n-1, m);

        return horizontal + vertical;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the floor: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of the tile: ");
        int m = sc.nextInt();

        System.out.println(placetiles(n, m));
        
    }
    
}
