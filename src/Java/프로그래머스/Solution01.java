package Java.프로그래머스;
/** 문자열 내 P와 Y의 개수 */
class Solution01 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cntP = s.length() - s.replace("p", "").length();
        int cntY = s.length() - s.replace("y", "").length();

        return cntP == cntY;
    }
}