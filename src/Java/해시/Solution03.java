package Java.해시;
/* 할인 행사*/
import java.util.*;
class Solution03 {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        int cnt = 0;
        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }

            if (map.equals(wantMap)) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
