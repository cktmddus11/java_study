package algorithm.ex42888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionEx {
    public static void main(String[] args){
        String answer[] = {};
//String[] record= {
//                "Enter uid1234 Muzi",
//                "Enter uid4567 Prodo",
//                "Leave uid1234",
//                "Enter uid1234 Prodo",
//                "Change uid4567 Ryan"
//        };

//        String[] record= {
//                "Enter A Muzi",
//                "Enter B Prodo",
//                "Enter C Cho",
//                "Leave A",
//               // "Change A Ryan",
//                "Leave B",
//                "Enter B Muzi",
//        };
        String[] record= {
               "Enter A A",
                "Enter B B",
                "Change A B"
        };

        List<UserStateInfo> list = convertList(record);
        for(UserStateInfo userStateInfo : list){
            System.out.println(userStateInfo);
        }

        //List<UserStateInfo> convertList
        answer = new String[list.size()];
        for(int z = 0;z<list.size();z++){
            UserStateInfo u = list.get(z);
            if(State.Enter.equals(u.getState())){
                answer[z] = String.format("%s님이 들어왔습니다.", u.getName());
            }else if(State.Leave.equals(u.getState())){
                answer[z] = String.format("%s님이 나갔습니다.", u.getName());
            }
        }



        System.out.println(Arrays.toString(answer));
    }

    private static List<UserStateInfo> convertList(String[] record) {
        List<UserStateInfo> list =new ArrayList<>();
        for(int i = 0;i<record.length;i++){
            String [] splitData = record[i].split(" ");
            UserStateInfo dto = null;
            if("Enter".equals(splitData[0])){
                // 이전 목록에서 동일한 아이디 있는지 비교해서 있으면 변경해줌.
                if(list.size() != 0){
//List<UserStateInfo> userStateInfo = list.stream().filter(a -> splitData[1].equals(a.getId()))
//                            .collect(Collectors.toList());
//                    for(int z = 0;z<userStateInfo.size();z++){
//                        UserStateInfo temp = userStateInfo.get(z);
//                        temp.setName(splitData[2]);
//                    }


                    list.stream().filter(a -> splitData[1].equals(a.getId())).forEach(c -> c.setName(splitData[2]));
                }
                dto = new UserStateInfo( i, State.Enter, splitData[1], splitData[2]);
            }else if("Leave".equals(splitData[0])){
                UserStateInfo temp = list.stream().filter(a -> splitData[1].equals(a.getId())).findFirst().orElse(null);
                dto = new UserStateInfo(i, State.Leave, splitData[1], temp.name);
            }else if("Change".equals(splitData[0])) {
// List<UserStateInfo> userStateInfo = list.stream().filter(a -> splitData[1].equals(a.getId()))
//                        .collect(Collectors.toList());
//                for(int z = 0;z<userStateInfo.size();z++){
//                    UserStateInfo temp = userStateInfo.get(z);
//                    temp.setName(splitData[2]);
//                }
                list.stream().filter(a -> splitData[1].equals(a.getId())).forEach(c -> c.setName(splitData[2]));
                //dto = new UserStateInfo(i, State.Change, splitData[1], splitData[2]);
            }

            if(dto != null) list.add(dto);
        }
        return list;
    }
}
class UserStateInfo {
    int idx;
    State state;
    String id;
    String name;

    public UserStateInfo(int idx, State enter, String id, String name) {
        this.idx = idx;
        this.state = enter;
        this.id = id;
        this.name = name;

    }

    public UserStateInfo(int idx, State leave, String id) {
        this.idx = idx;
        this.state = leave;
        this.id = id;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserStateInfo{" +
                "idx=" + idx +
                ", state=" + state +
                ", id='" + id + '\'' +
                (name == null ? "" : ", name='" + name+'\'') +
                '}';
    }
}
enum State {
    Leave, Enter, Change
}
