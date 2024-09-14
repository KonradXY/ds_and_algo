package _4_slidingwindow;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class _3_PermutationInStringTest {

    private _3_PermutationInString test;

    @BeforeMethod
    public void init() {
        test = new _3_PermutationInString();
    }


    @Test
    public void test() {
        assertTrue(test.isPermutation("eppip", "pippofalepippe"));
    }

}