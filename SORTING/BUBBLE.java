package SORTING;

public class BUBBLE {
    public static void arr_sort(int arr[]){
        System.out.print("After Sorting the array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //time complexity O(n^2)
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};

        // // bubble sort
        // for(int i=0; i<arr.length-1; i++){  // outer loop till n-1
        //     for(int j=0; j<arr.length-i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             // swap elements
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        // //Selection sort
        // for(int i=0; i<arr.length-1; i++){
        //     int smallest = i;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[smallest]> arr[j]){
        //             smallest=j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        //Insertion sort
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int j=i-1;
            while (j>=0 && curr <arr[j]) {
                arr[j+1] = arr[j];
                j--;                
            }
            arr[j+1]=curr;
        }


        arr_sort(arr);
    }
    
}
