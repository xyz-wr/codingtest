package Java.그리디;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] num = str.split("");
        int answer = 0;
        for (String s : num) {
            int n = Integer.parseInt(s);
            if (n <= 1 || answer <= 1) answer+=n;
            else answer *= n;
        }

        System.out.println(answer);

    }
}
