package _2_twopointers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class _0_IsPalindromeTest {

    _0_IsPalindrome test = new _0_IsPalindrome();

    @Test
    public void test() {
        assertTrue(test.isPalindrome("Was it a car or a cat I saw?"));
    }

}