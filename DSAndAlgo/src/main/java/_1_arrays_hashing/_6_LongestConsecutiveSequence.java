package _1_arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class _6_LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] arr) {
        if (arr.length <= 1) return arr.length;

        Set<Integer> uniqueInts = new HashSet<>();
        for (int num : arr) uniqueInts.add(num);

        int maxLength = 0;
        int currLenght;
        int val;

        for (Integer uniqueNum : uniqueInts) {
            if (!uniqueInts.contains(uniqueNum - 1)) {
                val = uniqueNum;
                currLenght = 0;
                while (uniqueInts.contains(++val))
                    maxLength = Math.max(maxLength, ++currLenght);
            }
        }

        return maxLength;
    }
}
