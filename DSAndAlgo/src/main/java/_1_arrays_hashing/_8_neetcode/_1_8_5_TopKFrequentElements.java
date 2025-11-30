package _1_arrays_hashing._8_neetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1_8_5_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // Buckets: index = frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (var entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            buckets[count].add(num);
        }

        int[] result = new int[k];
        int idx = 0;

        // Going backwards to get high freq first
        for (int i = buckets.length - 1; i >= 0 && idx < k; i--) {
            for (int num : buckets[i]) {
                result[idx++] = num;
                if (idx == k) break;
            }
        }

        return result;
    }
}
