package algorithm.ex12933;

import java.util.Arrays;
import java.util.Collections;

public class SolutionEx {
    public static void main(String[] args ){
        long n = 118372;
        long answer = 0;

        /*String nStr = String.valueOf(n);
        Integer[] arr = Arrays.stream(nStr.split("")).mapToInt(Integer::parseInt).toArray(Integer[]::new);*/
        /*for(long a : arr){
            System.out.println(a);
        }*/
        String nStr = String.valueOf(n);
        int [] arr =new int[nStr.length()];
        for(int i = 0;i<nStr.length();i++){
            arr[i]  = nStr.charAt(i) - 48;
        }
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());  // sort에 Comparator에 T에는 기본 자료형이 들어가지 못 해서입니다
        String result = "";
        for(int i = 0;i<nStr.length();i++){
            result += arr2[i];
        }
        answer = Long.valueOf(result);

        System.out.println(answer);
    }
}
