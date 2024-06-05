package Java.그리디;
/* 구명 보트 */
import java.util.*;
class Solution03 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int cnt = 0;
        while (i <= j) {
            if (people[i] + people[j] <= limit) i++;
            j--;
            cnt++;
        }
        return cnt;
    }
}