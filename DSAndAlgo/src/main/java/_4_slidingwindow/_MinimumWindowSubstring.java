package _4_slidingwindow;

public class _MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];   // ASCII
        int required = 0;

        // Build frequency for t
        for (char c : t.toCharArray()) {
            if (need[c] == 0) required++;  // count unique chars
            need[c]++;
        }

        int[] window = new int[128];
        int have = 0;

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;

            // If we've fulfilled this char requirement
            if (window[c] == need[c]) {
                have++;
            }

            // Try shrinking the window if it's valid
            while (have == required) {
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    minStart = left;
                }

                // Pop from left
                char leftChar = s.charAt(left);
                window[leftChar]--;

                if (window[leftChar] < need[leftChar]) {
                    have--;   // lost a requirement
                }

                left++; // shrink window
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(minStart, minStart + minLen);
    }

}
