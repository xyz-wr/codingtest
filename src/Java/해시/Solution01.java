package Java.해시;

import java.util.HashSet;
/* 두 개의 수로 특정값 만들기 */
public class Solution01 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 8}, 6));
        System.out.println(solution(new int[]{2, 3, 5, 9}, 10));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static boolean solution(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(target - i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }

}