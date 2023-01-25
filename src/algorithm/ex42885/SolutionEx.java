package algorithm.ex42885;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        String s = "01110";
        int[] answer = new int[2];
        // 3번의 이진 변환을 하는동안 3개의 0을 제거

        //int cnt = 0;
        int cnt = 0;
        int loop = 0;
        while(s.length() != 1){// !"1".equals(s)
          /*  for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    cnt++;
                }
            }*/
            cnt = s.length();
            // cnt를 replace처리 후에 길이 셋으면 되는데...;;;; 쓸대없이 먼저하니까 for문썻네...
            int removeZeroStr  =  s.replaceAll("0", "").length();
            cnt += cnt - removeZeroStr;  // cnt 후처리
           // System.out.println( s.length() - removeZeroStr);
            s = Integer.toBinaryString(removeZeroStr);
            loop++;
        }
        answer[0] =loop;
        answer[1] = cnt;

        System.out.println(Arrays.toString(answer));

    }
}
