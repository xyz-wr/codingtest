package Java.시뮬레이션;
/* 이진 변환 반복하기 */
class Solution04 {
    public int[] solution(String s) {
        int cntT = 0;
        int cntZ = 0;

        while (!s.equals("1")) {
            cntT++;

            int zero = s.replace("1", "").length();
            cntZ += zero;
            s = Integer.toBinaryString(s.length() - zero);
        }

        return new int[]{cntT, cntZ};
    }
}