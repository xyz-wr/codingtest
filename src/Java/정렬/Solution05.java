package Java.정렬;

import java.util.*;
class Solution05 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int from = commands[i][0] - 1;
            int to = commands[i][1];
            int n = commands[i][2] - 1;

            int[] arr = Arrays.copyOfRange(array, from, to);
            Arrays.sort(arr);
            answer[i] = arr[n];
        }
        return answer;
    }
}