package algorithm.stackQueue.SolutionEx1;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42586
public class SolutionEx1 {
    public static void main(String[] args){
        // 입력받는 값 선언 => 작업의 개수
        // progresses : 작업 진도율 / speeds : 속도
        Integer[] progresses = {95, 90, 99, 99, 80, 95};
        Integer[] speeds = {1, 1, 1, 1, 1, 5};
        // key : 언제 배포가능인지, value : 몇개의 기능이 배포가능한지.
        Map<Integer, Integer> result = new LinkedHashMap<>();

        Queue<Integer> queue = new ArrayDeque<>();



        for(int i = 0;i<progresses.length;i++){
            Integer progress = progresses[i]; // 30
            Integer nmg = 100 - progress; // 70
            Integer tempDay = nmg / speeds[i] + (nmg % speeds[i] > 0 ? 1 : 0) ;


            // 70 / 30 => 2 + 1
            // {7, 3, 9}
            //day[i] = tempDay;
            queue.add(tempDay);
        }
        //Arrays.sort(day);
        System.out.println(queue);

        int head = queue.peek();
        while(!queue.isEmpty()){
            if(head >= queue.peek()){
                result.put(head, result.getOrDefault(head, 0)+1);
                queue.remove();
                if(queue.size() != 0 && head < queue.peek()){
                    head = queue.peek();
                }
            }else {
                result.put(head, result.get(head)+1);
            }
        }
        System.out.println(result);
        System.out.println(result.values());





    }
}
