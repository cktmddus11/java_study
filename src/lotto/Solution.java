package lotto;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        int cnt = 0;
        int zeroCnt = 0;
        for(int i = 0;i<lottos.length;i++){
            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            }
            for(int j =0;j<win_nums.length;j++){
                if(win_nums[j] == lottos[i]){
                    cnt++;
                    break; // 한번 같은숫자는 또 나오지 않으니까 break 추가
                }
            }
        }
        answer[0] = win_nums.length-cnt-zeroCnt+(cnt != 0 || zeroCnt > 0 ? 1 : 0);
        answer[1] = win_nums.length-cnt+(cnt != 0 ? 1 : 0);

        return answer;
    }
}
