package Interview;

public class binary{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int x = 5;
        int result = binarySearch(arr, x);
    }

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
    }
}