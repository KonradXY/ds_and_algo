package _2_twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _2_FindKClosestElement {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;

        // Binary search for best left boundary
        while (left < right) {
            int idx = left + (right - left) / 2;

            // Compare distances to x
            if (x - arr[idx] > arr[idx + k] - x) {
                left = idx + 1;
            } else {
                right = idx;
            }
        }

        // Build the result from final window
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    public List<Integer> findClosestElementsByExpansion(int[] arr, int k, int x) {
        int n = arr.length;

        // 1. Find insertion index for x (lower bound)
        int right = Arrays.binarySearch(arr, x);
        if (right < 0) right = -right - 1;
        int left = right - 1;

        // 2. Expand k times
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        while (k-- > 0) {
            if (left < 0) {
                rightList.add(arr[right++]);
            } else if (right >= n) {
                leftList.add(arr[left--]);
            } else {
                // Choose closer side; if tie, choose left (smaller number)
                if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                    leftList.add(arr[left--]);
                } else {
                    rightList.add(arr[right++]);
                }
            }
        }

        // 3. Combine results without sorting
        // Left list is in reverse order, so reverse it
        Collections.reverse(leftList);

        // final result = reversed left side + right side
        leftList.addAll(rightList);

        return leftList;
    }
}
