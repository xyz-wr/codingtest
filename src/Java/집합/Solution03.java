package Java.집합;
/* 섬 연결하기 */
import java.util.Arrays;

class Solution03 {
    private int[] parent;

    private int find(int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = find(parent[x]);
    }

    private void union(int x, int y) {
        int root1 = find(x);
        int root2 = find(y);
        if (root1 != root2) {
            parent[root2] = root1;
        }
    }

    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2], o2[2]));

        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int answer = 0;
        int edges = 0;

        for (int[] edge : costs) {
            if (edges == n - 1)
                break;

            if (find(edge[0]) != find(edge[1])) {
                union(edge[0], edge[1]);
                answer += edge[2];
                edges++;
            }
        }
        return answer;
    }
}

