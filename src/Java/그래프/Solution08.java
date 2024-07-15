package Java.그래프;
/** 모음 사전 */
import java.util.*;
class Solution08 {
    private static String[] words = {"A", "E", "I", "O", "U"};
    private static ArrayList<String> list;

    private static void dfs(int idx, String str) {
        list.add(str);
        if (idx == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(idx+1, str + words[i]);
        }
    }

    public int solution(String word) {
        list = new ArrayList<>();
        dfs(0, "");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) return i;
        }

        return 0;
    }


}
