
//Conditional Sub arrays

//n is the size of array.
//target is the total value that we have to check not greater than target i.e., comprison value.
//array contains the sorted integer value.

public class conditional {
    public static int condition_arr(int[] arr, int n, int target){
        int count = 0;
        int i=0;
        int j=n-1;
        
        while(i<=j){
            if(arr[i] + arr[j] <= target){
                count += (j-i+1);
                i++;
            }
            else{
                j--;
            }

        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {3,4,16};
        int n = 3;
        int target = 6;
        System.out.println("The sub-array of array is " + condition_arr(arr, n, target));

    }
    
}
