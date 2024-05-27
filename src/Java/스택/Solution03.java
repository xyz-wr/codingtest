package Java.스택;

import java.util.Stack;

public class Solution03 {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(27));
        System.out.println(solution(12345));
    }

    public static String solution(int decimal) {
        return Integer.toBinaryString(decimal);
    }

}
