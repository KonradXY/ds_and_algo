package _1_arrays_hashing._8_neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _1_8_4_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            // Count characters
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // Build a key from the frequency array
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append(count).append('#');
            }
            String key = keyBuilder.toString();

            Arrays.toString(freq);

            // Add the word to its frequency group
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

}
