package _5_binarysearch;

public class _2_SmallestLetterGreaterThanTarget {

    /**
     * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
     * There are at least two different characters in letters.
     * Return the smallest character in letters that is lexicographically greater than target.
     * If such a character does not exist, return the first character in letters.
     */

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target >= letters[middle]) {    // il trick sta qui. Left punta sempre al carattere successivo a quello cercato (the smallest char greater than target)
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return letters[left];
    }

    public char searchChar(char[] sorted, char target) {
        int left = 0;
        int right = sorted.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target >= sorted[mid]) left = mid + 1;
            else right = mid - 1;
        }

        return 'a';
    }
}
