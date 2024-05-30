package Java.스택;

import java.util.*;
class Solution06 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            if (!stack.isEmpty() && prices[i] < prices[(stack.peek())]) {
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }

        return answer;
    }
}
