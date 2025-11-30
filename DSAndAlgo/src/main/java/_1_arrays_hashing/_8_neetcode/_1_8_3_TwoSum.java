package _1_arrays_hashing._8_neetcode;

import java.util.HashMap;
import java.util.Map;

public class _1_8_3_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement already seen, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise store current number and index
            map.put(nums[i], i);
        }

        // Problem guarantees one solution, so this won't be reached
        return new int[] {};
    }

}
