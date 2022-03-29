package algorithm.ex12943;

public class SolutionEx {
    public static void main(String [] args){
        int answer = 0;
        int num = 626331; // 오버플로우로 488로 결과 나옴 주의!!~!
        long numL = num;

        int cnt = 0;
        while(numL != 1){
            if(cnt >= 500){
                cnt = -1;
                break;
            }
            boolean isEven = numL % 2 == 0;
            numL =  isEven ? numL / 2 : numL * 3 + 1;
            cnt++;
        }
        answer = cnt;

        System.out.println(answer);
    }
}
