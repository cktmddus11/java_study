package algorithm.stackQueue.SolutionEx1;

import java.util.Arrays;

public class SolutionEx1_2 {
    public static void main(String[] args) {
        // 입력받는 값 선언 => 작업의 개수
        // progresses : 작업 진도율 / speeds : 속도
        Integer[] progresses = {95, 90, 99, 99, 80, 95};
        Integer[] speeds = {1, 1, 1, 1, 1, 5};

        int answer[] = {};

        int[] dayOfend = new int[100]; // 작업진도 100 미만 제한

        int day = -1;

        for(int i = 0; i<progresses.length;i++){
            while(progresses[i] + (day* speeds[i]) < 100){
                day++;
            }
            dayOfend[day]++;
        }
        answer=  Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
        // Arrays.stream 으로 바꿨다가 다시 array 로 바꾸는게 성능 안좋다???
        for (int a : answer){
            System.out.print(a+",");
        }
    }
}
