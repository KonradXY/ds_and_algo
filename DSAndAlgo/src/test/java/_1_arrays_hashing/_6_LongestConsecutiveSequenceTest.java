package _1_arrays_hashing;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class _6_LongestConsecutiveSequenceTest {

    int[] TEST_LONGEST_CONSECUTIVE = new int[]{2, 20, 4, 10, 3, 4, 5};

    _6_LongestConsecutiveSequence test = new _6_LongestConsecutiveSequence();

    @Test
    public void test() {
        assertEquals(test.longestConsecutiveSequence(TEST_LONGEST_CONSECUTIVE), 4);
    }

}