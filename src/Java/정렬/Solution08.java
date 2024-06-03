package Java.정렬;

import java.util.*;
/* 전화번호 목록 */
class Solution08 {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>(Arrays.asList(phone_book));

        for (String p : phone_book){
            for (int i = 1; i < p.length(); i++) {
                if (set.contains(p.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}