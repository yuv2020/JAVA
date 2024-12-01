package Capgemini;

// how many dealerships there are and the total number of cars in each dealership.
import java.util.*;

public class dealership {
    // declare an array of dealerships and their respective car counts
    public static int calculate(int cars, int bikes){
        return (cars * 4) + (bikes * 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total dealerdership: ");
        int dealer = sc.nextInt();

        int[] tyres = new int[dealer];

        for(int i = 0; i<dealer; i++){
            System.out.print("Enter the number of tyres in dealership " + (i+1) + ": ");
            int cars = sc.nextInt();
            // System.out.print("Enter the number of bikes: ");
            int bikes = sc.nextInt();
            tyres[i] = calculate(cars, bikes);
        }
        System.out.println("Total number of tyres count is : ");
        for(int t : tyres){
            System.out.println(t);
        }

        sc.close();
    }
    
}
