/*
package stackQueue;

import java.util.*;

public class SolutionEx3_1 {
    public static void main(String[] args) {
        int bridge_length = 100;
        int weight = 100;
        Queue<Integer> truck_weight = new LinkedList<>(Arrays.asList(10));
        Queue<Integer> truckOnBridge = new LinkedList<>();

        int time = 0;               //걸린시간
        int bridgeInTruckCnt = 0;  //다리에 올라간 트럭개수
        int bridgeInTruckWei = 0;



        do{
           // while(!truck_weight.isEmpty()){

                    if(!truck_weight.isEmpty()) {
                        if(!truck_weight.isEmpty()) bridgeInTruckWei += truck_weight.peek();
                        if (weight >= bridgeInTruckWei) {
                            truckOnBridge.add(truck_weight.poll());
                        } else {
                            bridgeInTruckWei = 0;
                            truckOnBridge.poll();
                        }
                    } else if(truckOnBridge.size() == bridge_length) {
                        bridgeInTruckWei -=  truckOnBridge.poll();

                    } else if(!truckOnBridge.isEmpty()){
                        truckOnBridge.poll();
                    }

                    //truckOnBridge.poll();
                    time++;

          //  }
      } while(!truck_weight.isEmpty() || !truckOnBridge.isEmpty());

        System.out.println(time);
    }
}
*/
