package Java.동적;
/* 정수 삼각형 */
class Solution03 {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[n-1][i] = triangle[n-1][i];
        }

        for (int i = n-2; i>=0; i--) {
            for (int j = 0; j <= i; j++){
                dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + triangle[i][j];
            }
        }

        return dp[0][0];
    }
}