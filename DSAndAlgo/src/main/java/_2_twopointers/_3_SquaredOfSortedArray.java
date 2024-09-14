package _2_twopointers;

public class _3_SquaredOfSortedArray {
    /**
     Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     */

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];

        int count = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[count] = nums[left] * nums[left];
                left++;
            } else {
                result[count] = nums[right] * nums[right];
                right--;
            }

            count--;
        }

        return result;
    }
}
