package Interview;

// Sum of all even no.s from array

public class even {
    public static void main(String[] args){
        int[] arr = {3,2,7,1,4};
        int even = sum_even(arr);
        int odd = sum_odd(arr);
        System.out.println("Sum of all even no. in array is : " + even);
        System.out.println("Sum of all odd no. in array is : " + odd);
    }

    public static int sum_even(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }


    // sum of all elements in the array for odd numbers
    public static int sum_odd(int[]arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    
}
