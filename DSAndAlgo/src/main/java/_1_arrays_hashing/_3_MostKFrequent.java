package _1_arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _3_MostKFrequent {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Bucket Sort
     */
    public int[] topKFrequent3(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : nums)
            count.merge(num, 1, Integer::sum);

        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]) {
                    res[index++] = val;
                    if (index == k)
                        return res;
                }
        return res;
    }

    /**
     * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
     */

    // O(N) + O(NlogN) (sort) NB: se invece di sortare completamente l'array usassimo una PQ diverrebbe O(NlogK)
    public List<Integer> topKFrequent(int[] nums, int k) {
        return getFrequencyMap(nums).values().stream()
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .collect(Collectors.toList());
    }

    // QUICKSELECT (HOARE's Algorithm) = O(N)
    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = getFrequencyMap(nums);

        int size = frequencyMap.size();
        int[] keys = new int[size];
        int i = 0;
        for (int key : frequencyMap.keySet()) keys[i++] = key;

        select(keys, frequencyMap, 0, size - 1, size - k);

        return Arrays.copyOfRange(keys, size - k, size);
    }

    private void select(int[] keys, Map<Integer, Integer> frequencyMap, int left, int right, int kSmallest) {
        while (left != right) {
            int pivot = partition(keys, frequencyMap, left, right, (left + right) / 2);

            if (kSmallest == pivot) return;

            if (kSmallest < pivot) right = pivot - 1;
            else left = pivot + 1;
        }
    }

    private int partition(int[] keys, Map<Integer, Integer> map, int left, int right, int pivot) {
        int pivotValue = map.get(keys[pivot]);
        swap(keys, pivot, right);
        int index = left;

        for (int i = left; i <= right; i++)
            if (map.get(keys[i]) < pivotValue) {
                swap(keys, i, index);
                index++;
            }
        swap(keys, right, index);
        return index;
    }

    private void swap(int[] keys, int i1, int i2) {
        int temp = keys[i1];
        keys[i1] = keys[i2];
        keys[i2] = temp;
    }

    private Map<Integer, Integer> getFrequencyMap(int[] nums) {
        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int num : nums) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);
        }
        return freqCount;
    }


}
