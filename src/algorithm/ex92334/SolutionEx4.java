package algorithm.ex92334;

import java.util.*;

public class SolutionEx4 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"}; // 이용자
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}; // 각 이용자가 신고한 이용자ID
        int k = 2;
        int[] answer = new int[id_list.length];

        // 신고당한 사람, 신고 한 사람 목록 (set으로 중복 제거)
        Map<String, Set<String>> map = new HashMap<>();
        for(String rep : report){
            String[] arr = rep.split(" ");
            Set<String> set = map.getOrDefault(arr[1], new HashSet<>());
            set.add(arr[0]);
            map.put(arr[1], set);
        }

        for(Map.Entry<String, Set<String>> entrySet : map.entrySet() ){
            System.out.println(entrySet.getKey()+"/"+entrySet.getValue());
        }
        /*
        *   muzi/[apeach]
            neo/[muzi, frodo]
            frodo/[muzi, apeach]
        *
        * */

        // 신고자 ,  신고한 사람중 정지처리된 회원 건수
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for(String id : id_list){
            countMap.put(id, 0);
        }

        for(Map.Entry<String, Set<String>> entrySet : map.entrySet() ){
           if(entrySet.getValue().size() >= k){ // 신고자가 두명이상이면 메일 발송 처리
               for(String value : entrySet.getValue()){ // 신고처리 메일 건수 증가
                   countMap.put(value, countMap.getOrDefault(value, 0)+1);
               }
           }
        }
        answer = countMap.values().stream()
                .mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
