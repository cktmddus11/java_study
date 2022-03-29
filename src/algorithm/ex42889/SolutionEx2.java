package algorithm.ex42889;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionEx2 {
    public static void main(String[] args){
        int N = 5; // 총 스테이지수
        int [] stages = {2,1,2,4,2,4,3,3}; // 스테이지에 도달한 사용자수
        // N+1 -> 6 은 클리어한 사용자를 말한다.
        int answer[] = {};

        Map<Integer, Integer> map = new TreeMap<>();
        map = Arrays.stream(stages)
                .boxed().collect(
                                Collectors.groupingBy(
                                        Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum))
                        );
        // Collectors.counting 을하면 long형을 리턴하게됨.
        double sumPeple = map.values().stream().mapToInt(i -> i).sum();
        System.out.println(sumPeple);

        for(int i = 1;i<=N;i++){
            if(!map.containsKey(i)){
                map.put(i, 0);
            }
            if(i == N && map.containsKey(N+1)) map.remove(N+1);
        }


        System.out.println(map);
        // {1=0.125, 2=0.42857142857142855, 3=0.5, 4=0.5, 5=0.0}
        Map<Integer, Double> result = new TreeMap<>();
        double sum = 0.0;
        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){
            int key = entrySet.getKey();
            int value = entrySet.getValue();

            if(map.containsKey(key-1)){
                sum += map.get(key-1);
            }

            System.out.println((double) value / (sumPeple - sum));
            result.put(key,(Double.isNaN((double) value / (sumPeple - sum)) ? 0.0 : (double) value / (sumPeple - sum)));
        }
        System.out.println(result);

        List<Integer> listKeySet = new ArrayList(result.keySet());
        Collections.sort(listKeySet, (v1, v2) -> (result.get(v2).compareTo(result.get(v1))));

        System.out.println(listKeySet);




        System.out.println(Arrays.toString(answer));
    }
}
/*
for(Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
        Map.Entry<String, String> entry = it.next();
        if(entry.getKey().equals("test")) {
        it.remove();
        }
        }*/
