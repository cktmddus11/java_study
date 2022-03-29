package ex42888;

import java.util.*;

public class SolutionEx4 {
    public static void main(String[] args){
        String[] record= {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        Map<String, String> codeMap = new HashMap<>();
        codeMap.put("Enter", "들어왔습니다.");
        codeMap.put("Leave", "나갔습니다.");

        Map<String, String> uidMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String str : record){
            String split[] = str.split("\\s+"); // \\s+ : 콤마 자름
            //System.out.println(Arrays.toString(split));
            String code = split[0];
            String uid = split[1];

            if(split.length > 2){ // Enter, Change일때 닉네임이 바뀌니까 그때만 map에 담아줌.
                String name = split[2];
                uidMap.put(uid, name);
            }
            if(!"Change".equalsIgnoreCase(code)){
                list.add(code+" "+uid); // change 제외, enter, leave읽때만 answer로 출력하니까 list에 담음.
            }
        }
        System.out.println(uidMap);
        System.out.println(list);
        String[] answer = new String[list.size()];
        for(int i = 0;i<answer.length;i++){
            String[] split = list.get(i).split("\\s+");
            String name = uidMap.get(split[1]);
            answer[i] = name+"님이 "+codeMap.get(split[0]);
        }


        System.out.println(Arrays.toString(answer));
    }
}
