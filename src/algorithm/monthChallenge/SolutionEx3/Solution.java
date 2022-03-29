package algorithm.monthChallenge.SolutionEx3;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        int disisorCnt = 0;

        for(int z = left;z<= right;z++){ // 14~ 17
            for(int i = 1; i<=z;i++){ // 1 ~ 자기자신(14)까지 나눠서
                if(z % i == 0){ //  나머지가 0이면 약수니까
                    ++disisorCnt; // 약수 cnt 증감
                }
            }
            // 약수 개수가 짝수(나머지가 0이면)면 더하고 / (나머지가 0이 아니면)홀수면 뺌
            answer += (disisorCnt % 2 == 0) ? z : z * -1;
            disisorCnt = 0; // 약수개수 초기화
        }

        return answer;
    }
}
