/*

package algorithm.ex42888;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};

        List<UserStateInfo> list = convertList(record);
        answer = new String[list.size()];

        for(int z = 0;z<list.size();z++){
            UserStateInfo u = list.get(z);
            if(State.Enter.equals(u.getState())){
                answer[z] = String.format("%s님이 들어왔습니다.", u.getName());
            }else if(State.Leave.equals(u.getState())){
                answer[z] = String.format("%s님이 나갔습니다.", u.getName());
            }
        }

        return answer;
    }

    private List<UserStateInfo> convertList(String[] record) {
        List<UserStateInfo> list =new ArrayList<>();
        for(String r : record){
            String [] splitData = r.split(" ");
            String state = splitData[0];
            String id = splitData[1];
            String name = !"Leave".equals(state) ? splitData[2] : "";
            
            UserStateInfo dto = null;
            if("Enter".equals(state)){
                // 이전 목록에서 동일한 아이디 있는지 비교해서 있으면 변경해줌.
                if(list.size() != 0){
                    list.stream().filter(a -> id.equals(a.getId())).forEach(c -> c.setName(name));
                }
                dto = new UserStateInfo(State.Enter, id, name);
            }else if("Leave".equals(state)){
                UserStateInfo findUserInfo = list.stream().filter(a -> splitData[1].equals(a.getId())).findFirst().orElse(null);
                dto = new UserStateInfo(State.Leave, id, findUserInfo.getName());
            }else if("Change".equals(state)) {
                // 이름 변경이면 동일한 아이디 있는지 비교해서 있으면 이름 변경해줌
                list.stream().filter(a -> id.equals(a.getId())).forEach(c -> c.setName(name));
            }

            if(dto != null) list.add(dto);
        }
        return list;
    }
}
class UserStateInfo {
    State state;
    String id;
    String name;

    public UserStateInfo( State state, String id, String name) {
        this.state = state;
        this.id = id;
        this.name = name;

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

}
enum State {
    Leave, Enter, Change
}
*/
