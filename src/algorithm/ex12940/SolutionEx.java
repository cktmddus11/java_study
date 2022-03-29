package algorithm.ex12940;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionEx {
    public static void main(String[] args){
        int n = 3;
        int m = 12;
        long nL = n;
        long mL = m;
        int answer[] = new int[2];

       /* int min = Math.min(n, m);
        int gcd = n % min == 0 && m % min == 0 ? min : 1; // 최대공약수
        int lcm =  n % min == 0 && m % min == 0 ? (n / min) * (m / min) * min :  n * m; // 최소공배수
        answer[0] = gcd;
        answer[1] = lcm;*/

        List nArr = new ArrayList<Integer>();
        for(long i = 1;i<= nL/2 ; i++){
            if(nL % i == 0){
                nArr.add(i);
            }
            if(i == nL/2){
                nArr.add(nL);
            }
        }
        System.out.println(nArr);

        List mArr = new ArrayList<Integer>();
        for(long i = 1;i<= mL/2 ; i++){
            if(mL % i == 0){
                mArr.add(i);
            }
            if(i == mL/2){
                mArr.add(mL);
            }
        }
        System.out.println(mArr);

        long min = 0;
        for(int i = 0;i<nArr.size();i++){
            for(int j = 0;j<mArr.size();j++){
                System.out.println(nArr.get(i)+"/"+ mArr.get(j)+"/"+min);
                if( nArr.get(i) == mArr.get(j))
                    min = (long) nArr.get(i);
            }
        }
        System.out.println(min);

       // int min = Math.min(n, m);
        long gcd = nL % min == 0 && mL % min == 0 ? min : 1; // 최대공약수
        long lcm =  nL % min == 0 && mL % min == 0 ? (nL / min) * (mL / min) * min :  nL * mL; // 최소공배수
        answer[0] = (int) gcd;
        answer[1] = (int) lcm;






        System.out.println(Arrays.toString(answer));
    }
}
