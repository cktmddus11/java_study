package algorithm.stackQueue.SolutionEx3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution3_6 {
    public static void main(String[] args){
        int answer = 0;
        int bridge_length = 2;
        int weight = 10;
        int [] truck_weight = {7, 4, 5, 6};

        Stack<Integer> truckStack = new Stack<>();
        Map<Integer, Integer> bridgeMap = new HashMap<>();

        // [7, 4, 5, 6] => [ 6, 5, 4, 7] 역순으로 스택에 담음
        // 스택은 나중에 들어온걸 먼저 빼기 때문에 !!!!!
        for(int i = truck_weight.length - 1; i>= 0; i--){
            truckStack.push(truck_weight[i]);
        }
        int sum = 0;

        while(true){
            answer++;

            if(bridgeMap.containsKey(answer)){
                bridgeMap.remove(answer);
            }
            // 다리위에 올라가있는 트럭 무게 sum
            sum = bridgeMap.values().stream().mapToInt(Number::intValue).sum();
            if(!truckStack.isEmpty()){
                if(sum + truckStack.peek() <= weight){
                    bridgeMap.put(answer+bridge_length, truckStack.pop());
                }
            }
            if(bridgeMap.isEmpty() && truckStack.isEmpty()){
                break;
            }
        }


        System.out.println(answer);
    }
}
