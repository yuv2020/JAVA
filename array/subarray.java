import java.util.Scanner;

public class subarray {
    public static int segment(int[] arr, int n){
        int l  = arr.length;
        int m = Integer.MIN_VALUE;

        for(int i=0; i<l-n; i++){
            int x = Integer.MAX_VALUE;
            for(int j = i; j<i+k; j++){
                x = Math.min(x, arr[j]);
            }
            m = Math.max(m, x);
        }
        return m;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input segment size 'k'
        System.out.print("Enter length of segment (x): ");
        int k = sc.nextInt();

        // Input array size 'n'
        System.out.print("Enter size of space (n): ");
        int n = sc.nextInt();

        // Input array elements
        System.out.println("Enter the elements of the space array:");
        int[] space = new int[n];
        for (int i = 0; i < n; i++) {
            space[i] = sc.nextInt();
        }
    }


    
}
