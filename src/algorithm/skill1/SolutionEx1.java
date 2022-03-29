package algorithm.skill1;

import java.util.Arrays;
// ex12932
public class SolutionEx1 {
    public static void main(String[] args){
        long n = 1234555555;
        int[] answer = {};

        //System.out.println(n % 10);
        //String l= Long.toString(n);
        answer = new int[String.valueOf(n).length()];
        for(int i = 0;i<answer.length;i++){     // 안된이유 !!!!!!!! answer배열이 int형이라서...;;
            answer[i] = (int) n % 10;
            n = n / 10;
        }

        System.out.println(Arrays.toString(answer));

    }
}
