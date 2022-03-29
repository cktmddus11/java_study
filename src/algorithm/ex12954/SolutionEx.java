package algorithm.ex12954;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        int x = -4;
        int n = 2;
        long[] answer = new long[n];

      /*  long temp = 0;
        for(int i = 0;i<n;i++){
            temp += + x;
            answer[i] = temp;
        }*/
       /* answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }*/

        for(int i = 0; i < n; i++){
            answer[i] = (long) x * (i + 1);
        }




        System.out.println(Arrays.toString(answer));


    }
}
