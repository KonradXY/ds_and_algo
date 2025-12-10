package _4_slidingwindow;

import java.util.Arrays;

public class _3_PermutationInString {

    /**
     * Given two strings pat and text, return true if text contains a permutation of pat, or false otherwise.
     * In other words, return true if one of pat's permutations is the substring of text.
     * <p>
     * SOLUTION:
     * creo 2 frequency array e verifico l'uguaglianza muovendo la finestra.
     * Se nn sono uguali  quello che faccio e sottrarre/sommare il caratter prec/succ all'interno del frequency array.
     */


    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Build frequency for s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int window = s1.length();

        // Build initial window in s2
        for (int i = 0; i < window; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(freq1, freq2)) return true;

        // Slide window across s2
        for (int i = window; i < s2.length(); i++) {
            // Include new char
            freq2[s2.charAt(i) - 'a']++;

            // Remove old char
            freq2[s2.charAt(i - window) - 'a']--;

            // Check match
            if (Arrays.equals(freq1, freq2)) return true;
        }

        return false;
    }

    // Helper to compare two frequency arrays


    public boolean isPermutation(String pattern, String text) {
        int[] freqPat = new int[26];
        int[] freqTxt = new int[26];

        for (char c : pattern.toCharArray()) freqPat[c - 'a']++;

        for (int i = 0; i < pattern.length(); i++) freqTxt[text.charAt(i) - 'a']++;

        for (int i = pattern.length(); i < text.length(); i++) {
            if (Arrays.equals(freqPat, freqTxt)) return true;
            freqTxt[text.charAt(i - pattern.length()) - 'a']--;
            freqTxt[text.charAt(i) - 'a']++;
        }
        return Arrays.equals(freqPat, freqTxt);
    }

}
