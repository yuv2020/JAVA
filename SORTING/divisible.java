package SORTING;

// You are given 4 integer each in new line then changes it to Three if it is divisible by 3, to give if divisible by 5, 
// to Three fiveif divisible by both 3 and 5 else keep it same.
import java.util.*;

public class divisible {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements for the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter the " + (i+1) + " the element");
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j<n; j++){
            int num = arr[j];

            if(num % 3 == 0 && num % 5 == 0){
                System.out.print(" Threefive");
            }
            else if(num % 3 == 0){
                System.out.print(" Three " + " ");
            }

            else if(num % 5 == 0){
                System.out.print(" Five " + " ");
            }

            else{
                System.out.print(num);
            }

        } 
        return;      
    }   
}
