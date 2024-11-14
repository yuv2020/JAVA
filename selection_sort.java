//Implement the sorting using selection sort method.


public class selection_sort {
    public static void printarr(int[] arr){
        System.out.println("Sorted array: " );
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        //Selection Sort
        for(int i=0; i<n-1; i++) {
            int min_idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        printarr(arr);
    }
    
}
