package algorithm.skill2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionEx2 {
    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"}; // 참여자
        String[] completion = {"stanko", "ana", "mislav"}; // 완주자
        String answer = "";

        //Map<String, Boolean> map = new HashMap<>();
        List<Player> list = new ArrayList<>();
        for(String player : participant){
            list.add(new Player(player, false));
        }

        for(int i = 0;i<completion.length;i++){
            for(int j = 0;j<participant.length;j++){
                if(participant[j] == completion[i]){
                    Player p = list.get(j);
                    if(!p.isComCheck()){
                        p.setComCheck(true);
                        list.set(j, p);
                        break;
                    }

                }
            }
        }
        for(Player p : list){
            if(!p.isComCheck()){
                answer = p.getPlayer();
            }
        }


        System.out.println(answer);
        System.out.println("=============================");
        Solution s = new Solution();
        String a = s.solution(participant, completion);
        System.out.println(a);
    }
}
class Player {
    String player;
    boolean comCheck;

    public Player(String player, boolean comCheck) {
        this.player = player;
        this.comCheck = comCheck;
    }

    public boolean isComCheck() {
        return comCheck;
    }

    public void setComCheck(boolean comCheck) {
        this.comCheck = comCheck;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                ", comCheck=" + comCheck +
                '}';
    }
}