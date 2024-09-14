package _3_stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class _3_GenerateParenthesisTest {

    private _3_GenerateParenthesis test = new _3_GenerateParenthesis();

    @Test
    public void test() {
        List<String> result = test.generateParenthesis(3);
        assertEquals(result, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
    }

}