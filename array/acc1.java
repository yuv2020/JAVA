import java.util.*;
import java.lang.reflect.Array;
import java.util.Scanner;
public class acc1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        double a= 0;
        double b = 0;
        int count = 0;
        for(int j=0; j<n; j++){
            a=Math.sqrt(arr[j]);
            b=Math.floor(a);

            if((a-b)==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
