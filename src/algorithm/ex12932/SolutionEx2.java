package algorithm.ex12932;

import java.util.Arrays;

public class SolutionEx2 {
    public static void main(String[] args) {

        long n = 12345;
        String s = String.valueOf(n);
        // 숫자 역으로 돌리고
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        // 돌린거 잘라서 배열에 담음.
        String[] ss = sb.toString().split("");

        int [] answer = new int[ss.length];
        for(int i = 0;i<ss.length;i++){
            answer[i] = Integer.parseInt(ss[i]);
        }
        System.out.println(Arrays.toString(answer));

    }
}
