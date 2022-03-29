package algorithm.ex42862;

import java.util.ArrayList;
import java.util.List;

public class SolutionEx {
    public static void main(String[] args){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1, 3, 5};
        int answer = 0;

        List<ReserveGive> list = new ArrayList<>();
        for(int i = 0;i<reserve.length;i++){
            list.add(new ReserveGive(reserve[i], false));
        }
        //////////////////
        int cnt = n-lost.length; // 체육복 있어서 체육 수업 참가가능한 학생수 => 전체 학생수 - 체육복 잃어버린 학생수
        for(int i = 0;i<lost.length;i++){
            for(int j = 0;j<list.size();j++){
                ReserveGive r = list.get(j); // 나눠줄 수 있는 학생 선택
                if((lost[i] == r.num+1 || lost[i] == r.num-1) && !r.isGive()){ // 여벌옷이 있는 학생이 다른 학생에게 옷을 빌려주지 않았고, 잃어버린 학생 앞뒤번호 인지 검사
                    r.setGive(true);  // 나눠줄 수 있으면 true flag처리
                    cnt++; // 참가가능한 학생수 증감
                }
            }
        }
        System.out.println(cnt);
        System.out.println(list);


        System.out.println(answer);
    }
}
class ReserveGive {
    int num;
    boolean isGive;

    public ReserveGive(int i, boolean b) {
        this.num= i;
        this.isGive = b;
    }

    public int getNum() {
        return num;
    }

    public ReserveGive setNum(int num) {
        this.num = num;
        return this;
    }

    public boolean isGive() {
        return isGive;
    }

    public ReserveGive setGive(boolean give) {
        isGive = give;
        return this;
    }

    @Override
    public String toString() {
        return "ReserveGive{" +
                "num=" + num +
                ", isGive=" + isGive +
                '}';
    }
}