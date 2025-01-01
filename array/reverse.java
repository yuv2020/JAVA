package array;

//Reverse all the elements of array
import java.util.*;

public class reverse {
    public void rev(int[] array, int start, int end) {
        if(start < end){
            int temp = array[start];
            array[start] = array[end];
            array [end] = temp;
            rev(array, start+1, end-1);
        }
    }

    public void display(int arr[], int n){
        System.out.println("Array in reverse order: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // public static void reverseArray(int[] arr) {
    //     reverse revObj = new reverse();
    //     int n = arr.length;
    //     revObj.rev(arr, 0, n-1);
    //     revObj.display(arr, n);
        
    // }

    public static void main(String[] args) {
        System.out.print("Enter the no. of elements to display : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Origial elements of the array : " + Arrays.toString(arr));
        System.out.println();

        reverse revObj = new reverse();
        revObj.rev(arr, 0, n-1);
        revObj.display(arr, n);
    }
    
}
