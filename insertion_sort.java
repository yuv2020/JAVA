// Implementing sorting using the insertion sort

public class insertion_sort {
    public static void printarr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int n = arr.length;
        
        //Insertion Sort
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>=key){
                arr[j+1] = arr[j];
                j--;
            }

            //placement

            arr[j+1] = key;
        }

        printarr(arr);
    }
    
}
