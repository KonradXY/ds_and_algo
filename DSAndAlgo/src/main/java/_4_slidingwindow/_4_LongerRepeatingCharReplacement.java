package _4_slidingwindow;

public class _4_LongerRepeatingCharReplacement {

    /** PROBLEM:
     * You are given a string text and an integer jollys.
     * You can choose any character of the string and change it to any other uppercase English character.
     * You can perform this operation at most jollys times.
     * Return the length of the longest substring containing the same letter you can get after performing the above operations.
     */

    public int characterReplacement(String text, int jollys) {
        int[] freq = new int[26];
        int currLongest = 0;
        int left = 0;
        int maxlen = 0;

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'A']++;
            currLongest = Math.max(currLongest, freq[text.charAt(i) - 'A']);
            if (i - left + 1 - currLongest > jollys) {
                freq[text.charAt(left) - 'A']--;
                left++;
            }
            maxlen = Math.max(maxlen, i - left + 1);
        }
        return maxlen;
    }

    /**
     * La soluzione sta nel:
     * 1. calcolare la frequenza dell'carattere considerato all'instante i (largestCharCount)
     * 2. verificare che la grandezza della finestra all'istante i + currLongest sia minore dei jolly disponibili
     *          (se considero 0 jolly il check e' corretto in quanto all'incrementare di i la condizione e' valida se il largestCharCount incrementa, ovvero se i caratteri sono identici)
     */

}
