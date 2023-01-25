package algorithm.ex42888;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionEx5 {
    private static final String ENTER_FORMAT = "%s님이 들어왔습니다.";
    private static final String LEAVE_FORMAT = "%s님이 나갔습니다.";

    private static Map<String, UserInfo> userMap = new HashMap<>();

    private static class UserInfo {
        public String userId;
        public String nickName;

        public UserInfo(String userId, String nickName){
            this.userId = userId;
            this.nickName = nickName;
        }
    }
    private static class Command{
        public char command;
        public String userId;

        public Command(char command, String userId){
            this.command = command;
            this.userId = userId;
        }

    }



    public static void main(String[] args) {
        String[] records = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        String[] answer = {};
        List<Command> commandList = new ArrayList<>();

        for(String record : records){
            String[] split = record.split(" ");
            String command = split[0];
            String userId = split[1];
            String nickName = null;

            switch (command.charAt(0)){
                case 'E': // Enter
                    nickName = split[2];
                    if(!userMap.containsKey(userId)){
                        userMap.put(userId, new UserInfo(userId, nickName));
                    }else{
                        userMap.get(userId).nickName = nickName;
                    }
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'L':
                    commandList.add(new Command(command.charAt(0), userId));
                    break;
                case 'C':
                    nickName = split[2];
                    userMap.get(userId).nickName = nickName;
                    break;
            }

        }


        answer =commandList.stream()
                .map(cmd -> String.format(cmd.command == 'E' ? ENTER_FORMAT : LEAVE_FORMAT, userMap.get(cmd.userId).nickName))
                .toArray(arr -> new String[commandList.size()]);
        System.out.println(answer);
    }


}

