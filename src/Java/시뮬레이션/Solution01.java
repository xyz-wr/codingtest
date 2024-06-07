package Java.시뮬레이션;
/* 배열 회전하기 */
import java.util.Arrays;

public class Solution01 {

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int n1 = 1;
        System.out.println(Arrays.deepToString(solution(arr1, n1)));
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int n2 = 2;
        System.out.println(Arrays.deepToString(solution(arr2, n2)));
    }

    private static int[][] rotate90(int[][] arr) {
        // ❷ 배열의 크기 저장
        int n = arr.length;

        int[][] rotatedArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedArr[j][n - i - 1] = arr[i][j];
            }
        }

        return rotatedArr;
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[][] solution(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr = rotate90(arr);
        }
        return arr;
    }

}