package _1_arrays_hashing._8_neetcode;

public class _1_8_2_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // Quick check: if lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Subtract counts using characters in t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        // If all counts are 0, it's an anagram
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
