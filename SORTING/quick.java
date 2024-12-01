package SORTING;

//Implement the Quick Sort function.
public class quick {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                
                //Swap the elements of the array
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //return index 
    }


    public static void quick_sort(int arr[], int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);

            quick_sort(arr, low, pivot-1);
            quick_sort(arr, pivot+1, high);

        }       

    }
    public static void main(String[] args){
        int arr[] = {3,4,6,2,8,9,1};
        int size = arr.length;

        quick_sort(arr, 0, size-1);

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
