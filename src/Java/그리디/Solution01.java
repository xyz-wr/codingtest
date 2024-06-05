package Java.그리디;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(123)));
        System.out.println(Arrays.toString(solution(350)));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[] solution(int amount) {
        int[] coins = {100, 50, 10, 1};

        ArrayList<Integer> change = new ArrayList<>();
        for (int coin : coins) {
            while (amount >= coin) {
                change.add(coin);
                amount -= coin;
            }
        }

        return change.stream().mapToInt(i -> i).toArray();
    }

}
