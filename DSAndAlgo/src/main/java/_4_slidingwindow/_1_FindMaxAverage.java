package _4_slidingwindow;

public class _1_FindMaxAverage {

    public double findMaxAverage(int[] nums, int window) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int sum = 0;
        for (int i = 0; i < window; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = 0; i < nums.length - window; i++) {
            sum = sum - nums[i] + nums[i + window];
            max = Math.max(sum, max);
        }
        return (double) max / (double) window;
    }

}
