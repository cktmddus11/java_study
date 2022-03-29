package stackQueue.SolutionEx3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 큐가 비어있는 경우
// 큐가 다리길이만큼 가득 차지 않은 경우
// 큐가 가득 찬 경우
public class SolutionEx3 {
    public static void main(String[] args){
        int bridge_length = 100;
        int weight = 100;
        int [] truck_weight = {10,10,10,10,10,10,10,10,10,10};

        int answer = 0;

        int time = 0;
        Queue<Integer> bridge_complete = new ArrayDeque<>();
        Queue<Integer> onBridge = new LinkedList<>();
        Queue<Integer> bridge_waiting = new ArrayDeque<>();

        for(int w : truck_weight){
            bridge_waiting.add(w);
        }
        //System.out.println(bridge_waiting);


        while(!bridge_waiting.isEmpty()){
            //Truck truck = bridge_waiting.peek(); // 기다리는 트럭 한대 꺼냄
            int truck = bridge_waiting.peek();
            int sumOnBridge = 0;

            if(!onBridge.isEmpty() && bridge_length == onBridge.size()){
                bridge_complete.add(onBridge.poll());
            }

            if(!onBridge.isEmpty()){ // 비어있지 않으면
               // sumOnBridge = onBridge.stream().parallel().map(a -> a.getWeight()).mapToInt(Integer::intValue).sum();
                sumOnBridge = onBridge.stream().parallel().mapToInt(Integer::intValue).sum();
                    //sumOnBridge = onBridge.peek().getWeight() ; //다리위에 있는 트럭 sum구해
            }


            // 10 - 0 >= 7
            if(weight  >= truck + sumOnBridge){ // 10kg이하니까
                onBridge.add(truck); // 다리위에 올리고
                bridge_waiting.remove(); // 기다리는 부분은 지워
            }else{
                onBridge.add(0); // 다리위에 올리고
                //bridge_waiting.remove(); // 기다리는 부분은 지워
            }
            /*if(weight  >= truck.getWeight() + sumOnBridge){ // 10kg 초과로 다리에 더 오를 수 없을 때
                Truck onBridgeTruk = onBridge.peek();
                int cnt = onBridgeTruk.getBridgeCnt()+1;
                onBridgeTruk.setBridgeCnt(cnt);
            }*/



            (time)++;
        }
        System.out.println(bridge_complete);
        answer = time+bridge_length;

        System.out.println(answer);

    }
}
/*
class Truck {
  //  boolean isOnBridge;
    int weight;
    int bridgeCnt;
   */
/* public boolean isOnBridge() {
        return isOnBridge;
    }

    public void setOnBridge(boolean onBridge) {
        isOnBridge = onBridge;
    }*//*


    public int getBridgeCnt() {
        return bridgeCnt;
    }

    public void setBridgeCnt(int bridgeCnt) {
        this.bridgeCnt = bridgeCnt;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck(int weight,int bridgeCnt) {
      //  this.isOnBridge = isOnBridge;
        this.bridgeCnt = bridgeCnt;
        this.weight = weight;
    }
}*/
