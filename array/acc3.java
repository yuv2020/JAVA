import java.util.*;

// Find the median of array by ignore the negative value.
public class acc3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = scanner.nextInt();

        int[] arr = new int [n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the " + (i+1) + "th2 element: ");
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for(int j=0; j<n; j++){
            if((arr[n+1])<0){
                count++;
            }
        }
        
        int m = 0;
        for(int i=0; i<n; i++){
            m += arr[i];
        }

        
        

    }
    
}
