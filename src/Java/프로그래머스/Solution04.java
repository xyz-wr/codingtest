package Java.프로그래머스;

class Solution04 {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a%b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
