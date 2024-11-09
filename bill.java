// Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  
// break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

// Rs.100/pizza
// Rs.20/puffs
// Rs.10/cooldrink
// Generate a bill for What Vohra has bought.

import java.util.Scanner;
import java.util.*;     

public class bill{
    public static void main(String[] args){
        int totalprice;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of pizzas: ");
        int pizzas = sc.nextInt();

        System.out.print("Enter the quantity of puffs: ");
        int puffs = sc.nextInt();
        
        System.out.print("Enter the quantity of cool drinks bought: ");
        int cooldrinks = sc.nextInt();

        int pizza = Math.abs(pizzas) * 100;
        int puff = Math.abs(puffs) * 20;
        int coldrink = Math.abs(cooldrinks) * 10;

        System.out.print("Bill details ");
        System.out.println();
        System.out.print("No. of pizzas: " + pizzas);
        System.out.println();
        System.out.print("No. of puffs: " + puffs);
        System.out.println();
        System.out.print("No. of coldrinks: " + cooldrinks);
        System.out.println();

        System.out.print("Total Price = " + pizza + puff + coldrink);
        System.out.println();

        System.out.print(" ENJOY THE SHOW! ");




        

    
    }
}