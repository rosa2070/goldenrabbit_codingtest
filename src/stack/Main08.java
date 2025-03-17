package stack;

import java.util.ArrayDeque;

public class Main08 {
    private boolean solution(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
