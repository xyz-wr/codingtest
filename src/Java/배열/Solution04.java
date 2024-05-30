package Java.배열;

import java.util.*;
/* 모의고사*/
class Solution04 {
    public int[] solution(int[] answers) {
        int[][] guess = {{1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int[] scores = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (answers[i] == guess[j][i % guess[j].length]) {
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (maxScore == scores[i]) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}