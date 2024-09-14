package _4_slidingwindow;

public class _2_MinimalLenghtGreaterThanTarget {

    /**
     * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
     * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
     */

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int window = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                window = Math.min(window, i - left + 1);
                sum -= nums[left++];
            }
        }
        if (window == nums.length)
            return 0;

        return window;
    }


}
