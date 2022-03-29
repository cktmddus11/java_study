package stackQueue.SolutionEx1;

// 스택 : LIFO(Last In First Out) : 마지막에 들어간게 처음으로 나감
// 큐 : FIFO(First In first Out)  : 처음으로 들어온게 처음으로 나감


// 스택 : 끝에서 삽입, 확인, 삭제 연산이 일어날 경우 사용
// 큐 : BFS?

// Queue
// Queue<V> queue = new ArrayDeque<>();
// Queue<V> queue = new LinkedList<>();

// Queue 는 인터페이스, 두개의 구현체로 생성 저장 가능.
// 효율은 LinkedList 가 속도는 ArrayDeque를 사용


// Stack<V> stack = new Stack<>();
// 인터페이스가 아니라 클래스

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;

// 한번에 통과 ~!~
public class Solution  {
    public int[] solution(int[] progresses, int[] speeds) {
        // 입력받는 값 선언 => 작업의 개수
        // progresses : 작업 진도율 / speeds : 속도
        int[] answer = {};

        // key = 작업완료까지 걸리는 작업일수 , value = 배포 가능 작업 수
        // 입력된 순서 유지하기 위해 LinkedHashMap 이용
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // 작업 진도율, 속도에 따라 작업이 완료될 일 저장.
        // 먼저진행해야 할 작업 부터 처리하고 뒤 작업을 진행해야하기 때문에
        // 처음들어온게 처음으로 나가게 되는 큐 사용
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 0;i<progresses.length;i++){
            Integer progress = progresses[i]; // 30
            Integer nmg = 100 - progress; // 70
            Integer tempDay = nmg / speeds[i] + (nmg % speeds[i] > 0 ? 1 : 0) ;
            // 남은 작업 진도율 / 속도를 해서 나머지가 없으면 작업완료까지 걸리는 작업일수, 나머지가 있으면 + 1 처리
            queue.add(tempDay);
        }

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

        answer = result.values().stream().mapToInt(a -> a).toArray();
        //mapToInt() : Stream에서 Int 원시 스트림으로 변환한다

        return answer;
    }

}
