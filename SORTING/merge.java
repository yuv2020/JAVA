package SORTING;

// implement the merge sort function.
public class merge {
    //Steps to divide the array
    
    //O(logn)

    public static void divide(int[] arr, int s, int e) {
        if(s >= e){
            return ;
        }
        int mid = s + (e-s)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);
        conquer(arr, s, mid, e);
    }

    //Steps for conquer the 

    //nlogn
    public static void conquer(int[] arr, int s, int mid, int e) {
        int merge[] = new int[e-s+1];
        
        int i = s, j = mid+1, k = 0;
        
        //o(n)
        while(i <= mid && j <= e) {
            if(arr[i] <= arr[j]) {
                merge[k++] = arr[i++];
            } else {
                merge[k++] = arr[j++];
            }
        }

        while(i<=mid){
            merge[k++] = arr[i++];
        }

        while(j<=e){
            merge[k++] = arr[j++];
        }

        for(int x=0, y=s; x<merge.length; x++, y++){
            arr[y] = merge[x];
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,65,23,9,34,67};
        int size = arr.length;

        divide(arr, 0, size-1);

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
    
}
