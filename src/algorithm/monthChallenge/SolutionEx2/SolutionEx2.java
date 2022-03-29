package algorithm.monthChallenge.SolutionEx2;

import java.util.*;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/68644
public class SolutionEx2 {

    public static void main(String[] args){
        int[] numbers = {5,0,2,7};
        Set<Integer> result = new TreeSet<>(); // 2,1,3,4,1
        int[] answer = {};

        for(int i = 0;i<numbers.length;i++){
            for(int j =0;j<numbers.length;j++){
                if(i != j){
                    result.add(numbers[i]+numbers[j]);
                }
            }
        }

        System.out.println(result);
        answer = result.stream().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(answer));
    }

}
