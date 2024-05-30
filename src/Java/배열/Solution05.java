package Java.배열;
/* 행렬의 곱셈 */
class Solution05 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int n2 = arr2[0].length;

        int[][] answer = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}