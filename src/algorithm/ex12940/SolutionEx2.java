package algorithm.ex12940;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionEx2 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int answer[] = new int[2];

        List nArr = new ArrayList<Integer>();
        for(int i = 1;i<= n/2 ; i++){
            if(n % i == 0){
                nArr.add(i);
            }
            if(i == n/2){
                nArr.add(n);
            }
        }
        System.out.println(nArr);

        List mArr = new ArrayList<Integer>();
        for(int i = 1;i<= m/2 ; i++){
            if(m % i == 0){
                mArr.add(i);
            }
            if(i == m/2){
                mArr.add(m);
            }
        }
        System.out.println(mArr);
        int min = 0;
        for(int i = 0;i<nArr.size();i++){
            for(int j = 0;j<mArr.size();j++){
                if(nArr.get(i) == mArr.get(j) && min <= (int) nArr.get(i))
                    min = (int) nArr.get(i);
            }
        }
        // n % min == 0 && m % min == 0 이과정을 넣을 필요가 없지 최대공약수가 1이면 min값에 1있을 텐데..
        int gcd = min;
        int lcm = (n / min) * (m / min) * min;
       // int gcd = n % min == 0 && m % min == 0 ? min : 1; // 최대공약수
       // int lcm =  n % min == 0 && m % min == 0 ? (n / min) * (m / min) * min :  n * m; // 최소공배수
        answer[0] = (int) gcd;
        answer[1] = (int) lcm;

        System.out.println(Arrays.toString(answer));
    }
}
