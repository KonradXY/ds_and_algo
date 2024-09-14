package _3_stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _3_GenerateParenthesis {

    private final Deque<String> stack = new ArrayDeque<>();
    private final List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return result;
    }

    private void backtrack(int left, int right, int n) {
        if (left == n && right == n) {
            result.add(new StringBuilder(String.join("", stack)).reverse().toString());
            return;
        }
        if (left < n) {
            stack.push("(");
            backtrack(left + 1, right, n);
            stack.pop();
        }
        if (right < left) {
            stack.push(")");
            backtrack(left, right + 1, n);
            stack.pop();
        }
    }
}
