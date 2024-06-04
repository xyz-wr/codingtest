package Java.트리;
/* 예상 대진표 */
class Solution02{
    public int solution(int n, int a, int b){
        int cnt = 0;
        while (a != b) {
            a = (a+1) / 2;
            b = (b+1) / 2;
            cnt++;
        }

        return cnt;
    }
}