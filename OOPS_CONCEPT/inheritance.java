package OOPS_CONCEPT;

import bank2;

// Example of Inheritance in Java
class Shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of triangle: " + (1/2 * l * h));
    }

}

class EquilateralTriangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of equilateral triangle: " + (1/2 * l * h));
    }
}

class Rectangle extends Shape{
    public void area(int l, int b){
        System.out.println("Area of rectangle: " + (l * b));
    }
}

public class inheritance {
    public static void main(String[] args){
        Triangle t = new Triangle(); 
        t.area(10, 12);

        bank2.Account account1 = new bank2.Account();
        account1.name = "Customer1 Account";
        

    }
    
}
