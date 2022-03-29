package algorithm.ex12915;

import java.util.Arrays;
import java.util.Comparator;

public class SolutionEx {
    public static void main(String[] args){
        String[] strings = {"sun", "bed", "car"};
        // u e a
        // => car, bed, sun
        int n = 1;
        String[] answer = {};

        // 움수일 경우 두 원소의 위치를 교환 안함.
        // 양수일 경우 두 원소의 위치를 교환함.
        // => 오름차순일 경우 o1 > o2 = 1 이면 => 양수니까 교환하니까 큰게 뒤로가는 오름차순이됨.
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char ch1 = o1.charAt(n);
                char ch2 = o2.charAt(n);
                //return ch1 >  ch2 ? 1 : -1;
                if(ch1 > ch2){
                    return 1;
                }else if(ch1 < ch2){
                    return -1;
                }else { // ch1 == ch2
                    return o1.compareTo(o2); /// return 0 해도 되네 ㅋㅋㅋ
                }
            }
        });
        //System.out.println(Arrays.toString(strings));
        answer = strings;


        System.out.println(Arrays.toString(answer));

    }
}
