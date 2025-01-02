package array;

//Calculate Sum of the Elements of the Array
import java.util.Arrays;
public class sum_array {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array list is: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];       
        }
        System.out.println("The sum of the elements of the array: " + sum);
    }
    
}
