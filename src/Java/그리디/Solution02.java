package Java.그리디;
/* 예산 */
import java.util.*;
class Solution02 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        for (int p : d) {
            if (budget < p) {
                break;
            }

            budget -= p;
            cnt++;
        }

        if (budget >= 0) return cnt;
        else return cnt-=1;
    }
}