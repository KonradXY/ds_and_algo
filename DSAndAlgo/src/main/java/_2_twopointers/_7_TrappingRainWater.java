package _2_twopointers;

public class _7_TrappingRainWater {

    /**
     Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
     */

    public int trap(int[] arr) {
        int n = arr.length;
        int[] maxLeftHeight = new int[n];
        int[] maxRightHeight = new int[n];

        maxLeftHeight[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxLeftHeight[i] = Math.max(arr[i], maxLeftHeight[i - 1]);
        }

        maxRightHeight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRightHeight[i] = Math.max(arr[i], maxRightHeight[i + 1]);
        }

        int water = 0;
        for (int i = 0; i < n; i++)
            water += Math.min(maxLeftHeight[i], maxRightHeight[i]) - arr[i];

        return water;
    }

    /**
     Intuition
     The height of the rain water trapped at particular bar can be: min( max(leftHeight), max(rightHeight) - currentHeight

     Approach
     ->Start by comsidering two arrays a prefix and suffix.
     ->Prefix array starts from the leftmost bar. It stores the max height of the bar to the left of the current bar.
     ->Similarly, the suffix array starts from right and stores the max height of the bar to the right of the current bar.
     ->Then,run a loop to return the sum of each unit of rain water trapped.
     */
}
