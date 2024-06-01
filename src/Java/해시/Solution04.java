package Java.해시;

import java.util.*;
class Solution04 {
    public String[] solution(String[] record) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");

        HashMap<String, String> uid = new HashMap<>();
        for (String s : record) {
            String[] temp = s.split(" ");
            if (temp.length == 3) {
                uid.put(temp[1], temp[2]);
            }
        }

        ArrayList<String> answer = new ArrayList<>();
        for (String s : record) {
            String[] temp = s.split(" ");
            if (msg.containsKey(temp[0])) {
                answer.add(uid.get(temp[1]) + msg.get(temp[0]));
            }
        }
        return answer.toArray(new String[0]);
    }
}