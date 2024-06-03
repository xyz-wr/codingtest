package Java.정렬;

import java.util.*;
/* 튜플 */
class Solution07 {
    public int[] solution(String s) {
        s = s.substring(0, s.length() -2).replace("{", "");
        String[] str = s.split("},");
        Arrays.sort(str, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        HashSet<String> set = new HashSet<>();
        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            String[] number = str[i].split(",");
            for (String n : number) {
                if (!set.contains(n)) {
                    answer[i] = Integer.parseInt(n);
                    set.add(n);
                }
            }
        }

        return answer;

    }
}
