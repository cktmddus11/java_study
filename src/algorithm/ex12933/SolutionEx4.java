package algorithm.ex12933;

import java.util.Arrays;

public class SolutionEx4 {
    public static void main(String[] args){
        long n = 118372;
        long answer = 0;

        String nArr[] = String.valueOf(n).split("");
        Arrays.sort(nArr);  // 문자열 정렬도되네
        
        StringBuilder sb = new StringBuilder();
        for(String a : nArr){
            sb.append(a);
        }
        answer = Long.parseLong(sb.reverse().toString()); // StringBuilder 역순 출력

        
        
        System.out.println(answer);
    }
}
