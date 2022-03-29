package algorithm.ex12932;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){

        long n = 12345;
        int [] answer = new int[String.valueOf(n).length()];
       // Long [] arr = new Long [String.valueOf(n).length()];
        for(int i = 0;i<answer.length;i++){
            answer[i] = (int) n % 10;
            n = n / 10;
        }
       // System.out.println(Arrays.toString(arr));
       /* answer = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            answer[i] = (int) arr[arr.length -i-1];
        }*/
       /* List<Long> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
        answer = list.stream().mapToInt(a -> a.intValue()).toArray();*/
       // answer = Arrays.stream(arr).mapToInt(a -> a.intValue()).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
