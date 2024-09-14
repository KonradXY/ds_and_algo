package _5_binarysearch;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class _2_SmallestLetterGreaterThanTargetTest {

    private _2_SmallestLetterGreaterThanTarget test = new _2_SmallestLetterGreaterThanTarget();


    @Test
    public void test() {
        assertEquals(test.nextGreatestLetter(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, 'a'), 'b');

        assertEquals(test.nextGreatestLetter(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, 'e'), 'f');

        assertEquals(test.nextGreatestLetter(new char[]{'a', 'a', 'a', 'a', 'a', 'b'}, 'a'), 'b');

        assertEquals(test.nextGreatestLetter(new char[]{'a', 'a', 'a', 'a', 'a', 'b'}, 'z'), 'a');

    }

}