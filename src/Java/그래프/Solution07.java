package Java.그래프;
/** 소수 찾기 */

import java.util.*;
class Solution07 {
    private static String Numbers;
    private static boolean[] visited;
    private static HashSet<Integer> set;

    private static void dfs(int idx, int offset, String num, boolean[] visited) {
        if (idx == offset) {
            int n = Integer.parseInt(num);
            if (isPrime(n)) set.add(n);
            return;
        }

        for (int i = 0; i < Numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(idx+1, offset, num + Numbers.charAt(i), visited);
                visited[i] = false;
            }
        }
    }


    private static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public int solution(String numbers) {
        Numbers = numbers;
        set = new HashSet<>();
        visited = new boolean[numbers.length()];

        for (int i = 1; i <= numbers.length(); i++) {
            dfs(0, i, "", visited);
        }
        return set.size();
    }
}
