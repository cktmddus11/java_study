package algorithm.ex12932;

import java.util.Arrays;

public class SolutionEx3 {
    public static void main(String[] args) {
        long n = 12345;
        int[] answer = {};

        Long [] arr = new Long [String.valueOf(n).length()];
        for(int i = 0;i<arr.length;i++){
            arr[i] = n % 10;
            n = n / 10;
        }
        answer = Arrays.stream(arr).mapToInt(a -> a.intValue()).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
