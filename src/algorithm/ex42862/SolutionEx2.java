package algorithm.ex42862;

import java.util.*;

public class SolutionEx2 {
    public static void main(String[] args){
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5}; // 여벌의 옷을 가져온 학생들의 번호 담긴 배열
        int answer = 0;

        List<StudentHave> list = new ArrayList<>();
        for(int j = 1;j<=n;j++){ // 학생들주 옷을 가진 사람들 isHave true
            StudentHave s = new StudentHave(j, false, true);
            for(int i = 0;i<lost.length;i++){
                if(j == lost[i]){
                    s.setHave(false);
                    break;
                }
            }
            list.add(s);
        }

        for(int j = 1;j<=n;j++){
            StudentHave s = list.get(j-1);
            for(int i = 0;i<reserve.length;i++){
                if(j == reserve[i]){
                    s.setGive(true);
                    break;
                }
            }
        }

        System.out.println(list);
        int cnt = n-lost.length;

        System.out.println(answer);
    }
}
class StudentHave {
    int num;
    boolean isGive;
    boolean isHave;

    public StudentHave(int i, boolean b, boolean h) {
        this.num= i;
        this.isGive = b;
        this.isHave = h;
    }

    public int getNum() {
        return num;
    }

    public StudentHave setNum(int num) {
        this.num = num;
        return this;
    }

    public boolean isHave() {
        return isHave;
    }

    public void setHave(boolean have) {
        isHave = have;
    }

    public boolean isGive() {
        return isGive;
    }

    public StudentHave setGive(boolean give) {
        isGive = give;
        return this;
    }

    @Override
    public String toString() {
        return "StudentHave{" +
                "num=" + num +
                ", isGive=" + isGive +
                ", isHave=" + isHave +
                "}\n";
    }
}