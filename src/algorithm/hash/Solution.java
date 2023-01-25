package algorithm.hash;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = false;

        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], answer);
        }

        for (String s : map.keySet()) {
            for (int i = 0; i < phone_book.length; i++) {
                if (!s.equals(phone_book[i])) {
                    if (s.contains(phone_book[i])) {
                        map.replace(phone_book[i], true);
                    }
                }
            }
        }

        boolean result= map.values().stream()
                .anyMatch(a -> a.equals(true));

        return !result;

    }
}