package _1_arrays_hashing._6_merge;

public class _1_6_2_SquaredOfSortedArray {
    /**
     Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     */

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;  // fill from end

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }

        return result;
    }
}
