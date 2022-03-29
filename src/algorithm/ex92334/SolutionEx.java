package algorithm.ex92334;

import java.util.*;
import java.util.stream.Collectors;
// map 순서대로 LinkedHashMaps
public class SolutionEx {
    public static void main(String[] args){
        String[] id_list=  {"muzi", "frodo", "apeach", "neo"}; // 이용자
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; // 각 이용자가 신고한 이용자ID
        int k = 2;
        int[] answer = new int[id_list.length];

        Map<String, Integer> reportCountMap = new LinkedHashMap<>(); // 각 ID당 신고 당한 횟수 저장
        Map<String, Integer> dis = new HashMap<>();                  // 신고 내용 한번만 저장하기 위함.
        Map<String, List<String>> reportIdMap = new LinkedHashMap<>(); // 각 ID당 신고한 ID저장

        // ID당 신고 횟수 0 초기값 지정
        for(String id : id_list){
            reportCountMap.put(id, 0);
        }


        for(String r : report){ // 신고된 내용 확인
            String [] report_Arr = r.split(" ");
            String reporter = report_Arr[0]; // 신고한사람
            String stopper = report_Arr[1];  // 신고당한사람

            dis.put(r, dis.getOrDefault(r, 0)+1); // 한 회원의 중복 신고건을 1건으로 처리하기 위해

            if(dis.get(r) <= 1){ // 한 회원이 동일 회원 여러번 신고 X, 하나의 신고건으로 처리
                reportCountMap.replace(stopper, reportCountMap.get(stopper) +1); // 신고 횟수 증감
                // 신고자가 신고한 ID 리스트 저장
                if(reportIdMap.containsKey(reporter)){
                    List<String> list = reportIdMap.get(reporter);
                    list.add(stopper);
                }else{
                    List<String> list = new ArrayList<>();
                    list.add(stopper);
                    reportIdMap.put(reporter, list);
                }

            }
        }

        System.out.println("dis = "+dis);  // dis = {apeach frodo=1, muzi frodo=1, apeach muzi=1, frodo neo=1, muzi neo=1}
        System.out.println("reportCountMap = "+reportCountMap);  // reportCountMap= {muzi=1, frodo=2, apeach=0, neo=2}
        System.out.println("reportIdMap = "+reportIdMap); // reportIdMap = {muzi=[frodo, neo], apeach=[frodo, muzi], frodo=[neo]}


        List<String> stopList = reportCountMap.entrySet().stream()
                .filter(i -> i.getValue() >= k)
                .map(Map.Entry::getKey) //  .map(i -> i.getKey())
                .collect(Collectors.toList());
        // k 번 이상 신고당한 사람 리스트 => 정지 대상자 => 이 회원을 신고한 회원에게  처리 메일 발송
        System.out.println(stopList);


        for(int y = 0;y<id_list.length;y++){
            int cnt = 0;
            if(reportIdMap.containsKey(id_list[y])){ // 회원마다 돌면서 신고요청목록이 있으면
                List<String> idList = reportIdMap.get(id_list[y]); // 회원이 신고한 ID 리스트
            /*    for (String id : idList) {
                    if (stopList.contains(id)) { // 신고한 ID리스트중 정지대상자에 포함되면 증감.
                        cnt++;
                    }
                }*/
               // cnt = (int) idList.stream().filter(i -> stopList.contains(i)).count();
                cnt = (int) idList.stream().filter(stopList::contains).count();
                answer[y] = cnt;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
