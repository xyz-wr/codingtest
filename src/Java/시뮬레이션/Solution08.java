package Java.시뮬레이션;
/* 캐릭터의 좌표 */
import java.util.*;
class Solution08 {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;

        HashMap<String, int[]> map = new HashMap<>();
        map.put("up", new int[]{0, 1});
        map.put("down", new int[]{0, -1});
        map.put("right", new int[]{1, 0});
        map.put("left", new int[]{-1, 0});

        int width = board[0]/2;
        int height = board[1]/2;

        for (String key : keyinput) {
            int dx = map.get(key)[0];
            int dy = map.get(key)[1];

            if (Math.abs(x+dx) <= width && Math.abs(y+dy) <= height){
                x += dx;
                y += dy;
            }
        }

        return new int[]{x, y};
    }
}