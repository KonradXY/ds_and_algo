package _1_arrays_hashing;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class _4_ProductOfArrayExceptSelfTest {

    _4_ProductOfArrayExceptSelf test = new _4_ProductOfArrayExceptSelf();


    @Test
    public void test() {
        assertEquals(test.productExceptSelf(new int[]{1, 2, 3, 4}), new int[]{24, 12, 8, 6});

    }

    @Test
    public void test2() {
        assertEquals(test.productExceptSelf(new int[]{-1, 1, 0, -3, 3}), new int[]{0, 0, 9, 0, 0});
    }

}