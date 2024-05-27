package 배열;

import java.util.HashMap;

class Solution06 {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
        }

        HashMap<Integer, Double> fails = new HashMap<>();

        double length = stages.length;

        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            } else {
                fails.put(i, challenger[i] / length);
                length -= challenger[i];
            }
        }

        return fails.entrySet().stream().sorted((o1, o2)
                        -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();
    }
}