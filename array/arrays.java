package array;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int[] marks = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        // int marks[] = new int [19];

        int size = sc.nextInt();
        int marks[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.println("The original array is " + marks[i]);
        }
        
        // marks[0] = 90; //phy
        // marks[1] = 85; // chem
        // marks[2] = 95; // maths
        // marks[3] = 80; // bio
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[3]);

        
    }

    
}
