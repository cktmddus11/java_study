package algorithm.monthChallenge.SolutionEx5;

import java.util.Arrays;

public class SolutionEx5_2 {
    public static void main(String[] args){
        int sum = 45; // 0 ~ 9까지의 합

        int numbers[] = {1,2,3,4,6,7,8,0};

        int numbersSum = Arrays.stream(numbers).sum();
        System.out.println(numbersSum);

        System.out.println(sum - numbersSum);


    }
}
