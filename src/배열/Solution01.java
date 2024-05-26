package 배열;

import java.util.Arrays;

public class Solution01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, -5, 2, 4, 3})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 1, 7})));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[] solution(int[] arr) {
        int[] clone = arr;
        Arrays.sort(clone);

        return clone;
    }

}