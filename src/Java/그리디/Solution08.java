package Java.그리디;
/* 단속 카메라 */
import java.util.*;
class Solution08 {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> (o1[1] - o2[1]));
        int answer = 0;
        int camera = -32700;
        for (int[] route : routes) {
            if (route[0] > camera) {
                answer++;
                camera = route[1];
            }
        }
        return answer;
    }
}