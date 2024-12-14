package Basic_ques;
// Given a non empty array of integers nums, every element appears twice except for one. Find the single one.

public class single_one {

    public static int single(int[] arr){
        int res = 0;
        for(int num : arr){
            res ^= num;
        }
        return res;
    }

    public static void main(String args[]){
        int[] arr = {12,23,12,2,2,1,1};
        System.out.println("the single type of array is " + single(arr));
    }
    
}
