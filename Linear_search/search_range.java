package Linear_search;

public class search_range {
    public static void main(String[] args) {
        int[] arr = {22, 41, 61, 8, 10, 192, 87,21};
        int x = 10;

        System.out.println(linear_search(arr, x, 1, 3));
    }
    
    public static int linear_search(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
