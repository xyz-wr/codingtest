package Java.그리디;
/* 귤 고르기 */
import java.util.*;
class Solution04 {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        int types = 0;
        int cnt = 0;

        for (int l : list) {
            cnt += l;
            types += 1;

            if (cnt >= k)
                break;
        }

        return types;
    }
}