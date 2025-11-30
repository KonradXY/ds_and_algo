package _2_twopointers;

import _1_arrays_hashing._6_merge._1_6_2_SquaredOfSortedArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _162_SquaredOfSortedArrayTest {

    _1_6_2_SquaredOfSortedArray test = new _1_6_2_SquaredOfSortedArray();

    @Test
    public void test() {
        Assert.assertEquals(test.sortedSquares(new int[]{-7, -3, 2, 3, 11}), new int[]{4, 9, 9, 49, 121});
    }

}