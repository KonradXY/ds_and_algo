package _2_twopointers;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _4_ThreeSumTest {

    private _4_ThreeSum test = new _4_ThreeSum();

    @Test
    public void test() {
        List<List<Integer>> result = test.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertThat(result).usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(List.of(
                        List.of(-1, -1, 2),
                        List.of(-1, 0, 1)));
    }

}