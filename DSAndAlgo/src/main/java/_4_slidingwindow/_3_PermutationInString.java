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


    public boolean checkInclusion(String pattern, String text) {
        if (pattern.length() > text.length()) return false;

        int[] freqPat = new int[26];
        int[] freqTxt = new int[26];

        for (char c : pattern.toCharArray()) freqPat[c - 'a']++;

        for (int i = 0; i < pattern.length(); i++) freqTxt[text.charAt(i) - 'a']++;

        for (int i = 0; i < text.length() - pattern.length(); i++) {
            if (Arrays.equals(freqTxt, freqPat)) return true;
            freqTxt[text.charAt(i + pattern.length()) - 'a']++;
            freqTxt[text.charAt(i) - 'a']--;
        }
        return Arrays.equals(freqTxt, freqPat);
    }


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
