package algorithm.monthChallenge.SolutionEx2;

import java.util.Arrays;

public class Permutation_nPn {
    static int N;
    static int[] numbers;
    static boolean[] selected;
    static int tc;


    public static void main(String[] args){
        N = 3;
        numbers = new int[N];
        selected = new boolean[N+1];
        permutation(0);
    }

    private static void permutation(int idx) {

        if(idx == N){
            tc++;
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for(int i = 1;i<= N;i++){
            // 중복검사 (이미 뽑은 경우 넘어감)
            if(selected[i]) continue;

            // 중복되지 않은 경우
            numbers[idx] =i;
            selected[i] = true;
            permutation(idx+1); // 다음 요소 뽑기
            selected[i] = false;
        }


    }
}
