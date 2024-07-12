package Java.그리디;

import java.util.Arrays;
/** 체육복 */
public class Solution07 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n - lost.length;

        // 여벌 & 도난
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }


        return answer;
    }
}
