package _4_slidingwindow;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class _2_MinimalLenghtGreaterThanTargetTest {

    private _2_MinimalLenghtGreaterThanTarget sol;

    @BeforeMethod
    public void setup() {
        sol = new _2_MinimalLenghtGreaterThanTarget();
    }

    @Test
    public void test1() {
        int[] input = new int[]{2, 3, 1, 2, 4, 3};
        int target = 7;

        assertEquals(sol.minSubArrayLen(target, input), 2);
    }

}