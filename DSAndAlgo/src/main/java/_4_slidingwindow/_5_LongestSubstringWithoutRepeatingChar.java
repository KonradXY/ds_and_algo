package _4_slidingwindow;

/**
 * Given a string s, find the length of the longest substring  without repeating characters.
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */

public class _5_LongestSubstringWithoutRepeatingChar {

    public int characterReplacement(String text) {
        int[] freqTxt = new int[26];
        int left = 0;
        int window = 0;

        for (int i = 0; i < text.length(); i++) {
            freqTxt[text.charAt(i) - 'a']++;

            if (freqTxt[text.charAt(i) - 'a'] == 1) {
                window = Math.max(window, i - left + 1);
            }

            while (freqTxt[text.charAt(i) - 'a'] > 1) {
                freqTxt[text.charAt(left) - 'a']--;
                left++;
            }
        }

        return window;
    }

}
