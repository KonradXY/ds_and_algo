package _1_arrays_hashing._8_neetcode;

import java.util.HashSet;

public class _1_8_1_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }

        return false; // No duplicates
    }
}
