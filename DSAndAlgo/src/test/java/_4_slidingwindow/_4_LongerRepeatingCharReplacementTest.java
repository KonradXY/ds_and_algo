package _4_slidingwindow;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class _4_LongerRepeatingCharReplacementTest {

    private _4_LongerRepeatingCharReplacement test;

    @BeforeMethod
    public void init() {
        test = new _4_LongerRepeatingCharReplacement();
    }

    @Test
    public void test() {
        assertEquals(test.characterReplacement("ABBA", 0), 2);
        assertEquals(test.characterReplacement("ABBA", 1), 3);
    }

}