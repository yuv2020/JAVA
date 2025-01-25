package Linear_search;

public class find_mini {
    public static void main(String[] args){
        int[] arr = {22, 41, 61, 8, 10, 192, 87,21};
        System.out.print(min(arr));
    }

    public static int min_num(int[] arr){
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
            return ans;
        }

    }
    
}
