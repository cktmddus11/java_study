package algorithm.monthChallenge.SolutionEx5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionEx5_3 {
    public static void main(String[] args){
       int answer = 0;

        int numbers[] = {1,2,3,4,6,7,8,0};
        // 0 ~ 9까지의 IntStream 셍성
        // IntStream.rangeClosed(0, 9) 가독성 좋음.(9까지 포함이라서)
       answer = IntStream.range(0, 10)
                       .filter(i -> Arrays.stream(numbers)
                               .noneMatch(num -> i == num)).sum();


        System.out.println(answer);


    }
}
