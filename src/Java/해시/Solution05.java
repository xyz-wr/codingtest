package Java.해시;
/* 베스트 앨범*/
import java.util.*;
class Solution05 {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> num = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            if (!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                num.put(genres[i], plays[i]);
                music.put(genres[i], map);
            } else {
                num.put(genres[i], num.get(genres[i]) + plays[i]);
                music.get(genres[i]).put(i, plays[i]);
            }
        }

        ArrayList<String> genresKey = new ArrayList(num.keySet());
        Collections.sort(genresKey, (s1, s2) -> num.get(s2) - num.get(s1));

        for (String key : genresKey) {
            HashMap<Integer, Integer> map = music.get(key);
            ArrayList<Integer> playKey = new ArrayList(map.keySet());
            Collections.sort(playKey, (s1, s2) -> map.get(s2) - map.get(s1));

            answer.add(playKey.get(0));
            if (playKey.size() > 1) {
                answer.add(playKey.get(1));
            }

        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}