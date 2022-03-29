package algorithm.ex92334;

import java.util.*;

public class SolutionEx3 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"}; // 이용자
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}; // 각 이용자가 신고한 이용자ID
        int k = 2;
        int[] answer = new int[id_list.length];

        List<User> users = new ArrayList<>();
        Map<String, Integer> suspendedList = new HashMap<>(); // 이름
        Map<String, Integer> idIdx = new HashMap<String, Integer>(); //<이름, 해당 이름의 User클래스 idx>

        int idx = 0;

        for(String name : id_list){
            idIdx.put(name, idx++);
            users.add(new User(name));
        }
        System.out.println(idIdx);
        System.out.println(users);

        for(String re : report){
            String[] str = re.split(" "); // muzi frodo => frodo user 객체 리턴,
            users.get(idIdx.get(str[0])).reportList.add(str[1]); // 회원이 신고한 사람 리스트
            users.get(idIdx.get(str[1])).reportedList.add(str[0]);  // 신고 당한 사람을 신고한 회원
        }

        for(User user : users){
            if(user.reportedList.size() >= k){ //2명의 신고를 받았으면
                suspendedList.put(user.name, 1); // suspendedList 에 추가 , 메일 발송 대상
            }
        }

        for(User user : users){
            for(String nameReport : user.reportList){ // 회원의 신고 리스트 반복 
                if(suspendedList.get(nameReport) != null){ // 신고 회원이 메일 발송대상자에 포함됐으면 메일 건수 증가
                    answer[idIdx.get(user.name)]++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }
}
class User{
    String name;
    HashSet<String> reportList;
    HashSet<String> reportedList;

    public User(String name) {
        this.name = name;
        this.reportList = new HashSet<>();
        this.reportedList = new HashSet<>();
    }
}
