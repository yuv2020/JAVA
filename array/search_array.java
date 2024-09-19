package array;
import java.util.Scanner;
public class search_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int j=0; j<n; j++){
            arr[j] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println(x +" found at index : " + i);
            }
                
        }

    }
    
}
