package Java.시뮬레이션;
/* 롤케이크 자르기 */
import java.util.*;
class Solution05 {
    public int solution(int[] topping) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int t: topping) {
            map.put(t, map.getOrDefault(t, 0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;

        for (int t : topping) {
            set.add(t);
            map.put(t, map.getOrDefault(t, 0)-1);

            if (map.get(t) == 0) map.remove(t);

            if (map.size() == set.size()) cnt++;
        }

        return cnt;
    }
}