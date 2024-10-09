import java.util.*;


// Accenture 2024
public class acc_median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + "th element: ");
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] positiveArr = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveArr[index] = arr[i];
                index++;
            }
        }

        Arrays.sort(positiveArr);

        double median;
        if (count % 2 == 0) {
            median = (positiveArr[count / 2 - 1] + positiveArr[count / 2]) / 2;
        } else {
            median = positiveArr[count / 2];
        }

        System.out.println("Median of the array: " + median);
    }
}