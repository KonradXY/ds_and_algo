package _5_binarysearch;

import java.util.ArrayList;
import java.util.List;

public class _7_FindKClosestElement {

    /**
     Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
     The result should also be sorted in ascending order.
     */

    // Sliding window solution
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // The sliding window is between 'mid' and 'mid' + k.
        int left = 0;
        int right = arr.length - k;
        while (left < right) {
            int midpoint = left + (right - left) / 2;

            // With midpoint on the left, we use x - arr[midpoint], while arr[midpoint + k] - x because it is on the right.
            // This is important!
            // Rather than using Math.abs(), we need the direction keep the x within the sliding window.
            // If the window is too far left, we shift the window to the right.
            if (x - arr[midpoint] > arr[midpoint + k] - x) {
                left = midpoint + 1;
            }
            // If the window is too far right, we shift the window to the left.
            else {
                right = midpoint;
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }


}
