package algorithm.monthChallenge.SolutionEx2;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> result = new TreeSet<>();
       // ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0;i<numbers.length;i++){
            for(int j =0;j<numbers.length;j++){
                if(i != j){
                    result.add(numbers[i]+numbers[j]);
                }
            }
        }
      /*  for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            answer.add(iter.next());
        }

        Collections.sort(answer); */


        answer = result.stream()
                .collect(Collectors.toList())
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}