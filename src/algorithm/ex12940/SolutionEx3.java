package algorithm.ex12940;

import java.util.Arrays;
// 성공 !!!!!!!!!!!!!!!!!
public class SolutionEx3 {
    public static void main(String[] args){
        int n = 2;
        int m = 5;

        long[] arr = new long[2];

        //arr[0] = n;
        //arr[1] = m;


        for(int i = Math.min(n, m);i>=1;i--){
            if(n % i == 0 && m % i == 0){
                arr[0] = i;
                arr[1] = (long) (n / i) * ( m / i) * i;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
