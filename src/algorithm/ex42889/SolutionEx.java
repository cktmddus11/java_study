package algorithm.ex42889;

import java.util.*;

public class SolutionEx {
    public static void main(String[] args){
        int N = 5; // 총 스테이지수
        int [] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 스테이지에 도달한 사용자수
        // N+1 -> 6 은 클리어한 사용자를 말한다.
       int answer[] = {};




        // 스테이지에 있는 총 사람수
        // 멥에 각 스테이지별 사람 수 카운트
        Map<Integer, Integer> map = new TreeMap<>();
        double sumPeople = 0;

        int max = Arrays.stream(stages).max().getAsInt();
        for(int i = 1;i<=max;i++){
            for(int j = 0;j<stages.length;j++){
                if(i == stages[j]) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
            if(!map.containsKey(i)) map.put(i, 0);

            sumPeople += map.get(i);
        }
        if(map.containsKey(N+1)) map.remove(N+1);
        double sum = 0.0;
        Map<Integer, Double> resultMap = new TreeMap<>();
        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            int key = entrySet.getKey();
            int value = entrySet.getValue();
            if(map.containsKey(key-1)){
                sum += map.get(key-1);
            }
            resultMap.put(key, value / (sumPeople - sum));
        }
        System.out.println(resultMap);

        //System.out.println(map + "||"+sumPeople);

        List<Integer> listKeySet = new ArrayList(resultMap.keySet());
        Collections.sort(listKeySet, (v1, v2) -> (resultMap.get(v2).compareTo(resultMap.get(v1))));

        System.out.println(listKeySet);

        answer = listKeySet.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
