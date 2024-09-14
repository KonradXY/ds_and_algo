package _1_arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class _0_3_TwoIntegerSum {

    /**
     * Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
     * <p>
     * You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
     * <p>
     * Return the answer with the smaller index first.
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);

        }

        return new int[]{0, 0};

    }

}
