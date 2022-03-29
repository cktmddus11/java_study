package algorithm.monthChallenge.SolutionEx5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionEx5 {
    public static void main(String[] args){
        int answer =0;

        int numbers[] = {5,8,4,0,6,7,9};
        int realNumbers[] = {0, 1, 2, 3, 4,5 ,6, 7, 8,9};

        List<Integer> resultList = new ArrayList();
            // as List 이상하네;;;;
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        List<Integer> realNubmerList =Arrays.stream(realNumbers).boxed().collect(Collectors.toList());

        for(int i = 0;i<realNubmerList.size();i++){
            if(!numberList.contains(realNubmerList.get(i))){
                resultList.add(realNubmerList.get(i));
            }
        }

        answer = resultList.stream().mapToInt(Integer::intValue).sum();


        System.out.println(answer);
    }
}
