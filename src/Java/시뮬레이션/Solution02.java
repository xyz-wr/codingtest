package Java.시뮬레이션;
/* 두 행렬을 곱한 후 전치 행렬 만들기 */
import java.util.Arrays;

public class Solution02 {

    public static void main(String[] args) {
        int[][] matrix1_1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2_1 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        System.out.println(Arrays.deepToString(solution(matrix1_1, matrix2_1)));

        int[][] matrix1_2 = {
                {2, 4, 6},
                {1, 3, 5},
                {7, 8, 9}
        };
        int[][] matrix2_2 = {
                {9, 1, 2},
                {4, 5, 6},
                {7, 3, 8}
        };
        System.out.println(Arrays.deepToString(solution(matrix1_2, matrix2_2)));
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[][] solution(int[][] matrix1, int[][] matrix2) {
        int[][] multiplied = multiplyMatrices(matrix1, matrix2);

        int[][] transposed = transposeMatrix(multiplied);

        return transposed;
    }

}