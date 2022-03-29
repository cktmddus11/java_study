package algorithm.ex17682;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SolutionEx {
    public static void main(String[] args) {
        String arr[] = {"1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*"};
        String dartResult = arr[6];
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        String[] st = dartResult.split("");
        int temp = 0;
        int numCheck = 0;
        for(int i = 0;i<st.length;i++){
            String t = st[i]; // 영어
            if("SDT".contains(t)) {
                Integer t3 = null; // 숫자
                if(numCheck != 2){
                    t3 = Integer.parseInt(st[i-1]);
                    numCheck = 0;
                }else{
                    t3 = 10;
                    numCheck = 0;
                }

                if ("S".equals(st[i])) {
                    temp += t3;
                } else if ("D".equals(st[i])) {
                    temp += Math.pow(t3, 2);
                } else if ("T".equals(st[i])) {  // T
                    temp += Math.pow(t3, 3);
                }

                if(i+1 != dartResult.length()) {
                    String t2 = st[i+1];
                    if ("#".equals(t2)) {
                        temp *= -1;
                    } else if ("*".equals(t2)) {
                        temp *= 2;
                        if (list.size() > 0) {
                            list.set(list.size() - 1, list.get(list.size() - 1) * 2);
                        }
                    }
                }

                list.add(temp);
                temp = 0;
            }else if(!"#*".contains(t)){
                numCheck++;
            }

        }
        System.out.println(list);
        answer = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(answer);

    }
}
