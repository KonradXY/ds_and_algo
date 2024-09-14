package _1_arrays_hashing;

public class _7_LargestSubarraySum {

    /**
     * Given an integer array nums, find the  subarray with the largest sum, and return its sum. (KADANE's Algorithm)
     */


    // Kadane's algorithm
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(current + nums[i], nums[i]);
            max = Math.max(max, current);
        }

        return max;
    }

    // variant of Kadane's to find the indexes of the max subarray
    public int[] maxSubArrayIndexes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return new int[]{0, 0};

        int current = nums[0];
        int max = nums[0];

        int maxLeft = 0;
        int maxRight = 0;

        int left = 0;

        for (int right = 1; right < nums.length; right++) {
            if (current < 0) {
                current = 0;
                left = right;
            }
            current += nums[right];

            if (max < current) {
                max = current;
                maxRight = right;
                maxLeft = left;
            }
        }


        return new int[]{maxLeft, maxRight};
    }
}
