package stackQueue.SolutionEx3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SolutionEx3_1_2 {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int [] truck_weight = {7, 4, 5, 6};

        int answer = 0;

        int time = 0;

        Queue<Integer> onBridge = new LinkedList<>();
        Queue<Integer> bridge_waiting = new ArrayDeque<>();

        for(int w : truck_weight){
            bridge_waiting.add(w);
        }

        int sumOnBridge = 0;
        while(!bridge_waiting.isEmpty()){
            //Truck truck = bridge_waiting.peek(); // 기다리는 트럭 한대 꺼냄
            int truck = bridge_waiting.peek();


            if(!onBridge.isEmpty() && bridge_length == onBridge.size()){
                int pollTruck = onBridge.poll();
                sumOnBridge -= pollTruck;
            }

            // 10 - 0 >= 7
            if(weight  >= truck + sumOnBridge){ // 10kg이하니까
                sumOnBridge += truck;
                onBridge.add(truck); // 다리위에 올리고
                bridge_waiting.remove(); // 기다리는 부분은 지워
            }else{ // 10kg를 초과하면 다음걸 올릴 수없으니까 0으로 넣어서 다리를 채움
                onBridge.add(0);
            }


            (time)++;
        }
        answer = time+bridge_length;

        System.out.println(answer);

    }
}
