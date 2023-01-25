package algorithm.stackQueue.SolutionEx3;

import java.util.LinkedList;
import java.util.Queue;



public class SolutionEx3_5 {
    static class Truck {
        int weight;
        int move;

        public Truck(int weight){
            this.weight = weight;
            this.move = 1;
        }
        public void moving(){
            move++;
        }
    }
     public static void main(String[] args){
        int answer = 0;
        int bridge_length = 100;
        int weight = 100;
        int [] truck_weight = {10};


        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        // 대기큐에 트럭 담음
        for(int t : truck_weight){
            waitQ.offer(new Truck(t));
        }
        int curWeight = 0;  // 다리위에 올라와있는 트럭 무게
        
        while(!waitQ.isEmpty() || !moveQ.isEmpty()){
            answer++;
            
            if(moveQ.isEmpty()){ // 다리가 비어있으면
                Truck t = waitQ.poll(); // 대기중인 트럭 하나 peek
                curWeight += t.weight; // 현재 무게 더해줌.
                moveQ.offer(t); // 다리위에 트럭 올림
                continue;
            }
            for(Truck t : moveQ){
                t.moving();
            }
            if(moveQ.peek().move >  bridge_length){
                Truck t  = moveQ.poll();
                curWeight -= t.weight;
            }
            // 대기중인 트럭이 있고 && 현재 무게 + 대기중인 트럭 무게  <= 다리가 버틸수 있는 무게
            //                        7            3        <= 10
            if(!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight){
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
        }
        // 1.다리 위에 큐, 대기중은 큐 끝날 때까지 반복
         // 2) 조건
         // 2-1) 다리 위에 트럭이 없으면 => 바로 대기중은 트럭 빼서 다리위에 올려
         // 2-2) 다리위에 올라간게 있으면 
         //     3-2) 다리위에 올라간 친구 위치 옮기고 
         //         4-1)  욺직인 트럭이 다리 끝에 도달했으면 
         //                다리위에서 뺴고 
         // 5-1) 대기중인 트럭이 다리위에 올려도되는 무게이면 올려

         // 기본적으로 가득 찻는지 확인 후 선두주자 를 뺴고 
         //  다리위에 있는 친구를 이동시키고 대기중인 친구를 다리에 올리는 순서


        System.out.println(answer);
    }
}
