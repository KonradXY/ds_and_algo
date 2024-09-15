package _5_binarysearch;

import java.util.Arrays;

public class _9_FaiCandySwap {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        for (int a : aliceSizes) sumAlice += a;
        for (int b : bobSizes) sumBob += b;

        // Calculate the difference that needs to be swapped
        int delta = (sumBob - sumAlice) / 2;

        // Sort bobSizes for binary search
        Arrays.sort(bobSizes);

        // Find the appropriate candies to swap using binary search
        for (int a : aliceSizes) {
            // Find the corresponding value in Bob's array
            if (binarySearch(bobSizes, a + delta)) {
                return new int[]{a, a + delta};
            }
        }

        // This line should never be reached as the problem guarantees a valid answer
        return new int[0];
    }

    // Binary search helper function
    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
