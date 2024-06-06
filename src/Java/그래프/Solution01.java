package Java.그래프;
/* 게임 맵 최단거리 */
import java.util.*;

class Solution01 {
    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;

        int[][] visited = new int[N][M];

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0, 0});
        visited[0][0] = 1;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if (maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }

        return visited[N-1][M-1] == 0 ? -1 : visited[N-1][M-1];
    }
}
