package algorithm.ex42889;

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

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
        List<Integer> listKeySet = new ArrayList(resultMap.keySet());
        Collections.sort(listKeySet, (v1, v2) -> (resultMap.get(v2).compareTo(resultMap.get(v1))));
        answer = listKeySet.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}

