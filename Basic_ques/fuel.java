package Basic_ques;
// Program to calculate the fuel consumption of your truck.The program should ask the user to enter the 
// quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the 
// fuel consumption and display it in the format (liters per 100 kilometers).

import java.util.*;
import java.text.*;
public class fuel {
    public static void main(String args[]){
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of litres to be fill the tank ");
        int litre = sc.nextInt();
        double l = (litre*1.00);
        
        System.out.println("Enter the distance covered in km ");
        int distance = sc.nextInt();        
        double consumption = distance * 1.00;

        double hundred = ((l/consumption)*100);
        System.out.println("Litres/100km " + df2.format(hundred));

        double miles = (distance * 0.6214);
        double gallons = (litre * 0.2642);

        double mg = miles / gallons;
        System.out.println("Miles/gallon " + df2.format(mg)); 






    }
    
}
