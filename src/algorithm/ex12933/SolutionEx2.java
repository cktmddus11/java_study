package algorithm.ex12933;

import java.util.Arrays;
import java.util.Collections;

public class SolutionEx2 {
    public static void main(String[] args ) {
        long n = 118372;
        long answer = 0;

        /*String nStr = String.valueOf(n);
        Integer[] arr = Arrays.stream(nStr.split("")).mapToInt(Integer::parseInt).toArray(Integer[]::new);*/
        /*for(long a : arr){
            System.out.println(a);
        }*/

        String nStr = String.valueOf(n);
        Integer[] arr = new Integer[nStr.length()]; // n을 배열로 담음.
        for(int i = 0;i<nStr.length();i++){
            arr[i] = nStr.charAt(i) - 48;
        }
        // 배열로 담은 n을 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        String reverseStr = "";// 내림차순정렬한 배열의 값을 하나의 문자열로 만듦
        for(int i = 0;i<nStr.length();i++){
            reverseStr += arr[i];
        }
        answer = Long.valueOf(reverseStr); // 문자열을 long형으로 변환

        System.out.println(answer);
    }

}
