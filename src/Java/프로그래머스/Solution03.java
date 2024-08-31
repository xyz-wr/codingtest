package Java.프로그래머스;

class Solution03 {
    public int solution(int n) {
        int cntN = Integer.bitCount(n);
        int nextN = n + 1;

        while (Integer.bitCount(nextN) != cntN) {
            nextN++;
        }

        return nextN;
    }
}