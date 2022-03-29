package hash.ex42576;

import java.util.HashMap;
import java.util.Map;

public class SolutionEx {
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            if (map.containsKey(p)) { // 이미 있으면 대체
                map.replace(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }
        }
        //System.out.println(map);

        for (String temp : completion) {

            Integer j = map.get(temp);
            map.replace(temp, --j);

        }
        String answer = null;
        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() >= 1) {
                answer = entrySet.getKey();
            }
        }

        //System.out.println(answer);

        return answer;
    }
}
