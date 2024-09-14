package _3_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1_ValidParenthesis {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (isOpenParenthesi(c)) {
                stack.push(c);
            } else {
                if (!popAndCheck(c, stack)) return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean popAndCheck(char c, Deque<Character> stack) {
        char pop = stack.pop();
        if (pop == '(') return c == ')';
        if (pop == '[') return c == ']';
        if (pop == '{') return c == '}';
        return false;
    }

    private boolean isOpenParenthesi(char c) {
        return c == '(' || c == '[' || c == '{';
    }
}
