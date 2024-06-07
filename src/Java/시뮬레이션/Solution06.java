package Java.시뮬레이션;
/* 카펫 */
class Solution06 {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int sqrt = (int)Math.sqrt(total);

        for (int width = 3; width <= sqrt; width++) {
            if (total % width == 0) {
                int height = (int)(total/width);
                if (brown == (width+height-2)*2) {
                    return new int[]{height, width};
                }
            }
        }

        return new int[]{};
    }
}