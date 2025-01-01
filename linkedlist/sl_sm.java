package linkedlist;

//Find the second largest and smallest element form th array.
public class sl_sm {
    public static int second_smallest(int arr[], int n){
        if(n<2){
            for(int i=0; i<arr.length; i++){
                System.out.println("Array should have at least 2 elements");
                return -1;
            }
        }
            int smallest = Integer.MAX_VALUE;
            int second_smallest = Integer.MAX_VALUE;

            int i;
            for(i=0; i<n; i++){
                if(arr[i]<smallest){
                    second_smallest = smallest;
                    smallest = arr[i];
                }
                else if(arr[i]<second_smallest && arr[i]!=smallest){
                    second_smallest = arr[i];
                }
            }
            return second_smallest;
    }

    public static int second_largest(int arr[], int n){
        if(n<2){
            for(int i=0; i<arr.length; i++){
                System.out.println("Array should have at least 2 elements");
                return -1;
            }
        }
            int largest = Integer.MIN_VALUE;
            int second_largest = Integer.MAX_VALUE;
            int i;

            for(i=0; i<n; i++){
                if(arr[i]>largest){
                    second_largest = largest;
                    largest = arr[i];
                }
                else if(arr[i]>second_largest && arr[i]!=largest){
                    second_largest = arr[i];
                }
            }
            return second_largest;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 3, 4, 50};
        int n = arr.length;

        int second_smallest = second_smallest(arr, n);
        int second_largest = second_largest(arr, n);

        System.out.println("Second Smallest element is: " + second_smallest);
        System.out.println("Second Largest element is: " + second_largest);

    }
    
}
