package algorithm.ex92334;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SolutionEx2 {
    public static void main(String[] args){
        String[] id_list=  {"muzi", "frodo", "apeach", "neo"}; // 이용자
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; // 각 이용자가 신고한 이용자ID
        int k = 2;

        // 중복제거한 신고 목록
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());

        System.out.println(list); // [muzi frodo, apeach frodo, frodo neo, muzi neo, apeach muzi]

        // 신고 횟수 저장
        Map<String, Integer> count = new HashMap<>();
        for(String s : list){
            String target = s.split(" ")[1]; // 신고대상
            count.put(target, count.getOrDefault(target, 0)+1);
        }
        System.out.println(count);

        int answer[] = {};
        answer = Arrays.stream(id_list).map(_user -> {
            final String user = _user; // muzi
            List<String> reportList = list.stream().filter(s -> s.startsWith(user+" ")).collect(Collectors.toList());
            // ID별로 신고한 회원 리스트 리턴
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();

    }
}
