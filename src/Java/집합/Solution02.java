package Java.집합;
/* 영어 끝말잇기 */
import java.util.*;
class Solution02 {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        char prev = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i]) || words[i].charAt(0) != prev) {
                return new int[]{(i%n)+1, (i/n) + 1};
            }
            set.add(words[i]);
            prev = words[i].charAt(words[i].length()-1);
        }

        return new int[]{0,0};
    }
}