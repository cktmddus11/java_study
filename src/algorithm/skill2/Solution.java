package algorithm.skill2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";  // 효율성 똥이네..

        List<Player> list = new ArrayList<>();
        for(String player : participant){
            list.add(new Player(player, false));
        }
        for(int i = 0;i<completion.length;i++){
            for(int j = 0;j<participant.length;j++){
                if(participant[j].equals(completion[i])){
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

        return answer;
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
}