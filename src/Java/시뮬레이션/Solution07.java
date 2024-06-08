package Java.시뮬레이션;
/* 점프와 순간 이동 */
import java.util.*;

public class Solution07 {
    public int solution(int n) {
        return Integer.toBinaryString(n).replace("0", "").length();
    }
}
