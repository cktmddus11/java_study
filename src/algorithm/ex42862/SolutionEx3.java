package algorithm.ex42862;

import java.util.*;
//  성공쓰....
public class SolutionEx3 {
    public static void main(String[] args){
        int n = 5;
        int[] lost = {4,2,1}; // 4에게 3 번이 지급해버리면 5가 할게 없어짐.
        int[] reserve = {3, 5};
        int answer = 0;


        //  학생번호  옷개수
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 1;i<=n;i++){
            map.put(i, 1);
        }
        System.out.println("학생 map 생성(기본옷개수 1) : "+map);

        for(int i : reserve){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
        }
        System.out.println("여벌옷 있는 학생 값 증감 : "+map);
        for(int i : lost){
            if(map.containsKey(i)){
                map.put(i, map.get(i)-1);
            }
        }
        System.out.println(map); // 없는 학생

       Arrays.sort(lost); // 작은수부터 해야지 더 많이 나눠주는듯..
        System.out.println(Arrays.toString(lost));
        for (int i : lost) { // 2
            int front = map.getOrDefault(i - 1, 0); // 잃어버린 사람이 맨 앞사람이면 1 => 더 앞사람은 없으니까 0처리
            int back = map.getOrDefault(i + 1, 0);
            if (front > 1 || back > 1) { // 앞사람 또는 뒷사람이 여벌옷이 있는지 확인.
                if (front > 1) {   // 앞사람이 빌려주면
                    map.put(i - 1, front - 1);
                } else { // 뒷사람이 빌려주면
                    map.put(i + 1, back - 1);
                }
                map.put(i, 1);  // 도단 당한 학생에게 지급
            }
        }



        System.out.println(map);



        long cnt = map.entrySet().stream().filter(i -> i.getValue() > 0).count();
        answer = (int) cnt;
        System.out.println(answer);
    }
}
