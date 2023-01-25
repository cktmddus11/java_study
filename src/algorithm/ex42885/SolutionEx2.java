package algorithm.ex42885;

import java.util.Arrays;

public class SolutionEx2 {
    public static int count;
    public static int zeroCount;

    public static void main(String[] args){
        String s = "01110";
        int []answer = new int[2];

        count = 0;
        zeroCount = 0;
        recursive(s);
        answer[0] = count;
        answer[1] = zeroCount;
        System.out.println(Arrays.toString(answer));
    }

    private static void recursive(String s) {
        if("1".equals(s)){
            return;
        }
        count++;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '0'){
                zeroCount++;
                continue; // 0이면 sb에 append안함.
            }
            sb.append(c); // 1만 append
        }
        recursive(Integer.toBinaryString(sb.length()));
    }
}
