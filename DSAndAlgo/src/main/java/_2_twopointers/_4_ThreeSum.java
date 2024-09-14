package _2_twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4_ThreeSum {

    /**
     Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
     i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     */

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    /**
     SPIEGAZIONE:

     Sort the input array nums in ascending order. This allows us to easily eliminate duplicate values and manipulate the pointers efficiently.

     Inside the loop, handle duplicate values. If i is greater than zero and the current element is the same as the previous element, skip to the next iteration.

     Initialize two pointers: j pointing to the element after i, and k pointing to the last element in the array.

     Calculate the sum of the elements at indices i, j, and k: sum = nums[i] + nums[j] + nums[k].
     If sum is less than zero, increment j to move towards higher values.
     If sum is greater than zero, decrement k to move towards lower values.
     If sum is equal to zero, we have found a valid triplet. Create a temporary vector temp and store the values nums[i], nums[j], and nums[k] in it. Add temp to the final result vector ans.

     Increment j and decrement k to continue searching for more triplets.

     Handle duplicate values by skipping over them. If j is still less than k and the current element is the same as the previous element, increment j and decrement k again.
     Once the while loop ends, continue with the next iteration of the outer loop, incrementing i.

     This approach ensures that we cover all possible triplets that sum up to zero while avoiding duplicates.
     */

}
