package _1_arrays_hashing;

import _1_arrays_hashing._4_product_except_self._1_4_1_ProductOfArrayExceptSelf;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class _1_4_1_ProductOfArrayExceptSelfTest {

    _1_4_1_ProductOfArrayExceptSelf test = new _1_4_1_ProductOfArrayExceptSelf();


    @Test
    public void test() {
        assertEquals(test.productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});

    }

    @Test
    public void test2() {
        assertEquals(test.productExceptSelf(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0});
    }

}