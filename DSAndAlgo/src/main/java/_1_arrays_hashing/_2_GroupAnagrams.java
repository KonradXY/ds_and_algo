package _1_arrays_hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _2_GroupAnagrams {

    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     */


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for (String s : strs) {
            String sortedString = Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));
            groupedAnagrams.computeIfAbsent(sortedString, k -> new ArrayList<>());
            groupedAnagrams.get(sortedString).add(s);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }

}
