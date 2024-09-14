package _4_slidingwindow;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class _5_LongestSubstringWithoutRepeatingCharTest {

    _5_LongestSubstringWithoutRepeatingChar test = new _5_LongestSubstringWithoutRepeatingChar();


    @Test
    public void test() {
        assertEquals(test.characterReplacement("abcdefghil"), 10);

        assertEquals(test.characterReplacement("abba"), 2);

        assertEquals(test.characterReplacement("abcdefghib"), 9);

        assertEquals(test.characterReplacement("abcdabc"), 4);

        assertEquals(test.characterReplacement("abcdabcdefghil"), 10);
    }
}