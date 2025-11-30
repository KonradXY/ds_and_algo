package _1_arrays_hashing;

import _1_arrays_hashing._8_neetcode._1_8_8_LongestConsecutiveSequence;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class _188_LongestConsecutiveSequenceTest {

    int[] TEST_LONGEST_CONSECUTIVE = new int[]{2, 20, 4, 10, 3, 4, 5};

    _1_8_8_LongestConsecutiveSequence test = new _1_8_8_LongestConsecutiveSequence();

    @Test
    public void test() {
        assertEquals(test.longestConsecutiveSequence(TEST_LONGEST_CONSECUTIVE), 4);
    }

}