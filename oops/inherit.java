package oops;

import java.util.*;

// import bank;//-
import bank;

// Inheritance example in Java

class shape{
    public void area(){
        System.out.println("Area of shape is not defined");
    }
}

class Triangle extends shape{               //Single level inherited from
    public void area(int l, int h){
        System.out.println((1/2) * l * h);
    }
}

class Equilateraltriangle extends Triangle{        //Multi level inheritance after single level inheritance
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}


public class inherit {
    public static void main(String[] args) {
        // Triangle t = new Triangle();
        // t.area(5, 6); // This will call the overridden area() method of triangle class
        // t.area(); // This will call the area() method of shape class (which is inherited)

        bank.Account a1 = new bank.Account();
        a1.name = "Customer";
        a1.deposit(1000);
        
    }
    
}
