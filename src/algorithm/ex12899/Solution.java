package algorithm.ex12899;

public class Solution {
    public String solution(int n) {
        String answer = "";

        int pattern[] = {1, 2, 7};

        int a = n / ((n-1)>0?(n-1):1) ;  // 1
        int aa = 1;


        for(int j = 0;j< n-1;j++){
            aa +=  pattern[(j%3) % (n-1)];
        }

        answer = aa+"";

        return answer;
    }
}