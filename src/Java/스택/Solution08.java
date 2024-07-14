package Java.스택;
/* 같은 숫자는 싫어 */
import java.util.*;

public class Solution08 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (!stack.isEmpty() && stack.peek() == a) {
                stack.pop();
            }
            stack.push(a);
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
