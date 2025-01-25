package Interview;

public class merge {
    public static void main(String[] args){
        int arr[] = {3,5,1,4,6,2};
        int l = arr.length;

        for(int n : arr){
            System.out.print(n + " ");
        }

        mergeSort(arr, 0, l-1);

        System.out.println("\nAfter sorting: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    private static void mergeSort(int arr[], int l, int r){
        if(l < r){
            int m = (l+r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        // Correctly populating larr and rarr
        for(int i = 0; i < n1; i++){
            larr[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++){
            rarr[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
}
