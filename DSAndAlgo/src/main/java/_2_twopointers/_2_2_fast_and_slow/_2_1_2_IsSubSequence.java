package _2_twopointers._2_2_fast_and_slow;

public class _2_1_2_IsSubSequence {

    public boolean isSubsequence(String s, String t) {
        int pos = -1;
        for (char c : s.toCharArray()) {
            pos = t.indexOf(c, pos + 1);
            if (pos == -1) return false;
        }
        return true;
    }

    public boolean isSubsequence2(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
