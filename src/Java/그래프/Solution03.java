package Java.그래프;
/* 미로 탈출 */
import java.util.*;

public class Solution03 {

    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    private static char[][] map;
    private static int n, m;

    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();

        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = maps[i].toCharArray();
        }

        int[] start = null, end = null, lever = null;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'S') start = new int[]{i, j};
                else if (map[i][j] == 'E') end = new int[]{i, j};
                else if (map[i][j] == 'L') lever = new int[]{i, j};
            }
        }

        int startLever = bfs(start, lever);
        int leverEnd = bfs(lever, end);

        if (startLever == -1 || leverEnd == -1)
            return -1;
        else
            return startLever + leverEnd;
    }

    private static int bfs(int[] start, int[] end) {
        int[][] visit = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        visit[start[0]][start[1]] = 1;
        q.add(start);

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;

                if (visit[nx][ny] > 0 || map[nx][ny] == 'X')
                    continue;

                visit[nx][ny] = visit[x][y] + 1;

                q.add(new int[]{nx, ny});

                if (nx == end[0] && ny == end[1])
                    return visit[end[0]][end[1]] - 1;
            }
        }

        return -1;
    }

}
