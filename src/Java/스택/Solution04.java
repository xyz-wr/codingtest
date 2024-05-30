package Java.스택;

import java.util.*;

class Solution04 {
    private boolean isCorrect(char[] ch, int offset) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[(offset + i) % ch.length];
            switch (c) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                case ')', '}', ']' -> {
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != c) return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public int solution(String s) {
        char[] ch = s.toCharArray();
        int cnt = 0;

        for (int offset = 0; offset < s.length(); offset++) {
            if (isCorrect(ch, offset)) {
                cnt++;
            }
        }
        return cnt;
    }
}