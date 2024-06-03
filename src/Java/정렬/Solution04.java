package Java.정렬;

import java.util.*;
class Solution04 {
    public long solution(long n) {
        String[] digits = String.valueOf(n).split("");

        Arrays.sort(digits, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String digit : digits) {
            sb.append(digit);
        }

        return Long.parseLong(sb.toString());
    }
}