package stackQueue.SolutionEx2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue queue = new ArrayDeque();
        int max = Arrays.stream(priorities).max().getAsInt();

        for(int i = 0;i<priorities.length;i++){
            queue.offer(priorities[i]);
        }

        for(int i = 0;i<priorities.length;i++){
            if(priorities[i] != max){
                int last = (int) queue.poll();
                queue.add(last);
            }
            if((int)queue.peek() == max){
                break;
            }
        }

        for(int i = 0;i<priorities.length;i++){
            if(priorities[location] == priorities[i]){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
