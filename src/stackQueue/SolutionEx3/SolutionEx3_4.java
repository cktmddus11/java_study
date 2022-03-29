package stackQueue.SolutionEx3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SolutionEx3_4 {
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int [] truck_weight = {7, 4, 5, 6};

        int answer = 0;

        int time = 0;

        Queue<Truck> onBridge = new LinkedList<>();
        Queue<Truck> bridge_waiting = new LinkedList<>();


        for(int w : truck_weight){
            bridge_waiting.add(new Truck(w, 0));
        }

        int sumOnBridge = 0;
        while(!bridge_waiting.isEmpty()){
            Truck waitTruck = bridge_waiting.peek();

            if(!onBridge.isEmpty() && bridge_length == onBridge.peek().getBridgeCnt()){ // 다리가 가득 찬경우
                sumOnBridge -= onBridge.poll().getWeight();
            }
            if(onBridge.isEmpty()){ // 비어있으면
                sumOnBridge += waitTruck.getWeight();
                //int w = waitTruck.getBridgeCnt();
               // waitTruck.setBridgeCnt(++w);
                waitTruck.upperBridgeCnt();

                onBridge.add(waitTruck); // 다리위에 올리고
                bridge_waiting.remove(); // 기다리는 부분은 지워
            }
            else if(weight  >= waitTruck.getWeight() + sumOnBridge){ //다리에 가득차진 않고 대기중 트럭이 들어올수 있는경우
                Truck onBridgeTruck = onBridge.peek();
//                int o = onBridgeTruck.getBridgeCnt();
//                onBridgeTruck.setBridgeCnt(++o);
                onBridgeTruck.upperBridgeCnt();


                sumOnBridge += waitTruck.getWeight();
               /* int w = waitTruck.getBridgeCnt();
                waitTruck.setBridgeCnt(++w);*/
                waitTruck.upperBridgeCnt();
                onBridge.add(waitTruck); // 다리위에 올리고
                bridge_waiting.remove(); // 기다리는 부분은 지워
            }else{  // 다리에 가득차지 않고 대기중인 트럭이 들어올 수 없는 경우
                Truck onBridgeTruck = onBridge.peek();
                /*int w = onBridgeTruck.getBridgeCnt();
                onBridgeTruck.setBridgeCnt(++w);*/
                onBridgeTruck.upperBridgeCnt();
            }
            time++;
        }
        answer = time + bridge_length;

        System.out.println(answer);

    }
}
class Truck {
    int weight;
    int bridgeCnt;

    void upperBridgeCnt(){
        bridgeCnt++;
    }

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

    public Truck(int weight, int bridgeCnt) {
        this.bridgeCnt = bridgeCnt;
        this.weight = weight;
    }
}

