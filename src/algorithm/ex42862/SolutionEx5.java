package algorithm.ex42862;

import java.util.HashSet;

public class SolutionEx5 { // 현재테스트 케이스에는 정렬이안됐을 경우에는 안되네
    public static void main(String[] args){
        int n = 5;
        int[] lost = {4,2,1}; // 4에게 3 번이 지급해버리면 5가 할게 없어짐.
        int[] reserve = {3, 5};
        int answer =n-lost.length;
        HashSet<Integer> ko = new HashSet<Integer>();
        for(int k : reserve) {
            ko.add(k);
        }
        for(int i =0;i<lost.length;i++) {
            if(ko.contains(lost[i])) {
                //System.out.println("내껀내가입지");
                answer++;
                ko.remove(lost[i]);
                lost[i]=-1;
            }
        }


        for(int i =0;i<lost.length;i++) {
            //System.out.println(i);

            if(ko.contains(lost[i]-1)) {
                //System.out.println("있다");
                answer++;
                ko.remove(lost[i]-1);
            }else if(ko.contains(lost[i]+1)) {
                //System.out.println("있다");
                answer++;
                ko.remove(lost[i]+1);
            }
            //System.out.println("없다");
        }
        System.out.println(answer);

    }
}
