package hash.solutionEx2;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public boolean solution(String[] phone_book){
        Arrays.sort(phone_book);

        Set<String> set = Arrays.stream(phone_book)
                .collect(Collectors.toSet());

        System.out.println(set); // [119456, 119457, 11945611]

        boolean answer = true;
        for(String phone : phone_book){
            if(set.stream().anyMatch(a -> !a.equals(phone)
                    && a.contains(phone))){
                answer = false;
                break;
            }
        }
        return answer;
    }
}

//import java.util.HashMap;
//        import java.util.Map;
//class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = false;
//
//        Map<String, Boolean> map = new HashMap<>();
//        for (int i = 0; i < phone_book.length; i++) {
//            map.put(phone_book[i], answer);
//        }
//
//        for (String s : map.keySet()) {
//            for (int i = 0; i < phone_book.length; i++) {
//                if (!s.equals(phone_book[i])) {
//                    if (s.contains(phone_book[i])) {
//                        map.replace(phone_book[i], true);
//                    }
//                }
//            }
//        }
//
//        boolean result= map.values().stream()
//                .anyMatch(a -> a.equals(true));
//
//        return !result;
//
//
//    }
//}