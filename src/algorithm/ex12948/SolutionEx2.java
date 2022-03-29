package algorithm.ex12948;

import java.util.Arrays;

public class SolutionEx2 {
    public static void  main(String[] args){
        String answer = "";
        String phone_number = "027778888";


        char[] ch = phone_number.toCharArray();
        for(int i = 0;i<ch.length-4;i++){
            ch[i] = '*';
        }
        System.out.println(Arrays.toString(ch)); // [*, *, *, *, *, 8, 8, 8, 8]
        answer = String.valueOf(ch); //String.value(char[] data) => char 배열을 문자열로 리턴해줌.

        System.out.println(answer);
    }
}
