package _1_arrays_hashing._8_neetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1_8_8_LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {
            // Only start counting if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int len = 1;

                while (set.contains(current + 1)) {
                    current++;
                    len++;
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static void bucketSort(double[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // 1. Create buckets
        List<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 2. Put array elements into buckets
        for (double num : arr) {
            int bucketIndex = (int)(num * n); // scale number to bucket
            buckets[bucketIndex].add(num);
        }

        // 3. Sort individual buckets
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // 4. Concatenate all buckets
        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                arr[index++] = num;
            }
        }
    }
}
