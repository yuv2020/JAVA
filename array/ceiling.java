
// Ceiling of a number using the bst property in sorted array
//Implement the first element to be searched first
public class ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 0 , 5, 6};
        int target = 2;
        int index = binarySearch(arr, target);
        System.out.println("The value of : " + index);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left; // return the index of the first element greater than or equal to target
    }    
}


