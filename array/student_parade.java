package array;

import java.util.Scanner;

public class student_parade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();

        System.out.print("Enter the string: ");
        String str = sc.next();

        int i=0; 
        int j=n-1;

        boolean found = false;

        while (i<n) {
            if(str.charAt(i) == 'I'){
                if(found){
                    break;
                }
                else{
                    found = true;
                }
            }
            i++;            
        }

        while (j>=i) {
            if((str.charAt(j )=='I')){
                break;
            }         
            j--; 
        }

        if(i==n){
            System.out.println(0);
        }
        else{
            System.out.println(j-i+1);
        }

    }
    
}
