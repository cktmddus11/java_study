package algorithm.ex12939;

import java.util.Arrays;
import java.util.OptionalInt;

public class SolutionEx {
    public static void main(String[] args) throws Exception {
        String s = "-1 -2 -3 -4";
        String answer = "";

        String []splitStr = s.split(" ");
        System.out.println(Arrays.toString(splitStr));
        //IntStream stream = Arrays.stream(splitStr).mapToInt(Integer::parseInt);
        int arr[] = Arrays.stream(splitStr).mapToInt(Integer::parseInt).toArray();
        //answer += stream.min().toString();
        // answer += " "+stream.max().toString();
        OptionalInt minNum = Arrays.stream(arr).min();
        OptionalInt maxNum = Arrays.stream(arr).max();

        answer = String.format("%d %d", minNum.getAsInt(), maxNum.orElseGet(null));
        // null리턴할일 없긴하니까 get()써도 될거같긴함.
        // 정렬때려서 맨앞, 맨뒤 하는방법도 ㄱㅊㄱㅊ

        // StringBuffer 써서 append하는 방법도 있





        System.out.println(answer);
    }
}
