package Java.스택;
/* 올바른 괄호*/
import java.util.*;
class Solution01 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
