package _2_twopointers._2_1_converging;

import java.util.Arrays;

public class _2_1_6_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2]; // initialize with first 3 numbers

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // If this sum is closer, update
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++; // need a larger sum
                } else if (sum > target) {
                    right--; // need a smaller sum
                } else {
                    // Exact match → closest possible
                    return sum;
                }
            }
        }
        return closest;
    }

}
