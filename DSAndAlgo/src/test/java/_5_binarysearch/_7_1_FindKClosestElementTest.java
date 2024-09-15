package _5_binarysearch;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _7_1_FindKClosestElementTest {

    _7_1_FindKClosestElement test = new _7_1_FindKClosestElement();

    @Test
    public void test() {
        List<Integer> result = test.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);

        assertThat(result)
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void test2() {
        List<Integer> result = test.findClosestElements(new int[]{1,1,1,10,10,10}, 1, 9);

        assertThat(result)
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(10));
    }

}