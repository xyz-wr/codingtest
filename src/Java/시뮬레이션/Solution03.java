package Java.시뮬레이션;
/* 달팽이 수열 만들기 */
import java.util.Arrays;

public class Solution03 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
        System.out.println(Arrays.deepToString(solution(4)));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[][] solution(int n) {
        // ❶ n 크기의 2차원 배열 생성
        int[][] snailArray = new int[n][n];

        int num = 1;

        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                snailArray[startRow][i] = num++;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                snailArray[i][endCol] = num++;
            }
            endCol--;

            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    snailArray[endRow][i] = num++;
                }
                endRow--;
            }

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    snailArray[i][startCol] = num++;
                }
                startCol++;
            }
        }

        return snailArray;
    }

}
