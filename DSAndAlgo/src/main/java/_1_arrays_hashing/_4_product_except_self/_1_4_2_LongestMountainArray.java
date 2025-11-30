package _1_arrays_hashing._4_product_except_self;

public class _1_4_2_LongestMountainArray {

    public int longestMountain(int[] arr) {
        int maxWindow = 0;
        int idx = 1; // start from second element

        while (idx < arr.length - 1) {

            // Check if arr[idx] is a peak
            if (arr[idx] > arr[idx - 1] && arr[idx] > arr[idx + 1]) {
                // Expand left
                int left = idx - 1;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Expand right
                int right = idx + 1;
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Update max length
                maxWindow = Math.max(maxWindow, right - left + 1);

                // Move idx to the end of this mountain
                idx = right;
            } else {
                idx++;
            }
        }

        return maxWindow;
    }
}
