package Java.시뮬레이션;
/** 최소 직사각형 */
class Solution09 {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        return width * height;
    }
}
