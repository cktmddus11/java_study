package stackQueue.SolutionEx3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        int time = 0;
        Queue<Integer> bridge_waiting = new LinkedList<>();
        Queue<Integer> onBridge = new LinkedList<>();


        for(int w : truck_weights){
            bridge_waiting.add(w);
        }
        int sumOnBridge = 0; // 다리위에 올라간 트럭 무게

        while(!bridge_waiting.isEmpty()){ // 대기중인 트럭 없을 때 까지 반복
            int truck = bridge_waiting.peek(); // 대기중인 트럭 가장먼지 있는거 꺼냄

            // 다리에 트럭이 있고 and 다리가 가득 찼으면
            if(!onBridge.isEmpty() && bridge_length == onBridge.size()){
               int pollTruck = onBridge.poll();
               sumOnBridge -= pollTruck;
            }
            /*if(!onBridge.isEmpty()){ // 비어있지 않으면
                sumOnBridge = onBridge.stream().parallel().mapToInt(Integer::intValue).sum();
            }*/
            if(weight  >= truck + sumOnBridge){ // 10kg이하니까
                sumOnBridge += truck;
                onBridge.add(truck); // 다리위에 올리고
                bridge_waiting.remove(); // 기다리는 부분은 지워
            }else{ // 10kg를 초과하면 다음걸 올릴 수없으니까 0으로 넣어서 다리를 채움
                onBridge.add(0); 
            }
            time++;
        }
        // 대기중인 트럭이 없으면 종료되므로
        // 다리에 올라간 트럭이 나오는데 걸리는 값인 bridge_length를 더해줌.
        answer = time+bridge_length;


        return answer;
    }
}