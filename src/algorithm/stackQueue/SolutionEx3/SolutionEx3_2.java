package algorithm.stackQueue.SolutionEx3;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionEx3_2 {
    public static void  main(String[] args){
        int answer = 0;

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};


        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for(int i = 0;i<truck_weights.length;i++){
            int truck = truck_weights[i];

            while(true){
                // 큐에 아무것도 없는 경우 = 어떠한 트럭도 다리 위에 없음
                if(queue.isEmpty()){
                    queue.add(truck);
                    sum += truck;
                    time++;
                    break;
                }else if(queue.size() == bridge_length) {
                    //  다리 길이만큼 트럭이 다 찬 경우
                    sum -= queue.poll(); // 다리에 올라간 트럭 무게 빼줌
                }else { // 다리길이만큼 큐가 차지 않음
                    // weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌.
                    if(sum + truck <= weight){
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    }else{// 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건너게 만듬
                        queue.add(0);
                        time++;
                    }

                }
            }
        }

        // 마지막 트럭에서 반복문이 끝나는데, 마지막 역시 다리 길이만큼 지나가야하기에 + 다리 길이
        answer = time + bridge_length;
        System.out.println(answer);

    }
}
