package stackQueue.SolutionEx1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SolutionEx1_3 {
    public static void main(String[] args) {
        // 입력받는 값 선언 => 작업의 개수
        // progresses : 작업 진도율 / speeds : 속도
        Integer[] progresses = {95, 90, 99, 99, 80, 95};
        Integer[] speeds =     {1,  1,  1,  1,  1,  5};
        //                      1   2   2   2   3   3

        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0;i<speeds.length;i++){
            double remain = (100 - progresses[i]) / (double) speeds[i];
            int date = (int) Math.ceil(remain); //소수점 있으면 반올림 되도록

            if(!q.isEmpty() && q.peek() < date){ // 작업 가능한 만큼(queue.size()) 큐에 담는 방식
                answerList.add(q.size());  // 큐 삭제 기준 => 큐 맨압에 담긴 작업 일수보다 더 크면 큐 삭제 후 다시 담는 방식식
               q.clear();
            }
            q.offer(date); //큐에 값 추가 / 차이점 => add : 큐가 꽉차면 예외발생, offer : 실패의미로 false 내보냄
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];

        for(int i = 0;i<answer.length;i++){
            answer[i] = answerList.get(i);
        }


        for (int a : answer){
            System.out.print(a+",");
        }





    }
}
