package _2_twopointers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_SquaredOfSortedArrayTest {

    _3_SquaredOfSortedArray test = new _3_SquaredOfSortedArray();

    @Test
    public void test() {
        Assert.assertEquals(test.sortedSquares(new int[]{-7, -3, 2, 3, 11}), new int[]{4, 9, 9, 49, 121});
    }

}