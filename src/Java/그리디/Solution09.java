package Java.그리디;

import java.util.Arrays;
import java.util.Scanner;

/** 모험가 길드 */
public class Solution09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n];
        for (int i = 0 ; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        Arrays.sort(temp);

        int cnt = 0;
        int group = 0;
        for (int i = 0; i < n; i++) {
            cnt += 1;
            if (temp[i] <= cnt) {
                group += 1;
                cnt = 0;
            }
        }

        System.out.println(group);
    }

}
