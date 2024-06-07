package Java.그래프;
/* 전력망을 둘로 나누기 */
import java.util.*;
class Solution05 {
    private static boolean[] visited;
    private static ArrayList<Integer>[] adjList;
    private static int N, answer;
    public int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;

        adjList = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            adjList[wire[0]].add(wire[1]);
            adjList[wire[1]].add(wire[0]);
        }

        visited = new boolean[n+1];
        dfs(1);
        return answer;
    }

    private static int dfs(int now) {
        visited[now] = true;
        int sum = 0;

        for (int next : adjList[now]) {
            if (!visited[next]){
                int cnt = dfs(next);
                answer = Math.min(answer, Math.abs(N-cnt*2));
                sum += cnt;
            }
        }

        return sum + 1;
    }
}
