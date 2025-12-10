package _1_arrays_hashing._4_product_except_self;

public class _1_4_1_ProductOfArrayExceptSelf {

    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     * <p>
     * Example 1: Input: nums = [1,2,3,4] Output: [24,12,8,6] ====>> prefix[1,1,2,6] - postfix[24,12,4,1] == prefix*postfix
     * <p>
     * Example 2:  Input: nums = [-1,1,0,-3,3]  Output: [0,0,9,0,0]
     */

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int left = 1;
        int right = 1;

        // Build the left product array
        for (int i = 0; i < nums.length; i++) {
            res[i] = left;
            left *= nums[i];
        }

        // Multiply by right product
        for (int i = nums.length-1; i >=0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }


}
