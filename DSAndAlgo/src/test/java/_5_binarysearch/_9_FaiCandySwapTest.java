package _5_binarysearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _9_FaiCandySwapTest {

    _9_FaiCandySwap test = new _9_FaiCandySwap();

    @Test
    public void test() {
        int[] result = test.fairCandySwap(new int[]{1,1}, new int[]{2,2});

        Assert.assertEquals(result, new int[]{1,2});
    }

}