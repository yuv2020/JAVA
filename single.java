import java.util.*;

public class single {
    public class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
    
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number is: " + singleNumber(nums1));

    }
    
}
