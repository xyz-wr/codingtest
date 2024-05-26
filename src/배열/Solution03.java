package 배열;

import java.util.HashSet;

class Solution03 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
