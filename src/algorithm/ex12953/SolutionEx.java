package algorithm.ex12953;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        int[] arr = {3,4,9,16};
        int answer = 1;

        int min = Arrays.stream(arr).min().getAsInt(); // 최대공약수 초기값 지정
        for(int i = min;i>= 1;i--){
            boolean nmgZero = true;
            for (int k : arr) {
                if (k % i != 0) {
                    nmgZero = false;
                    break;
                }
            }
            // 최소값으로 배열의 모든 값들이 나누어 떨어지면 최대공약수로 봐도됨
            if(nmgZero) {
                min = i; // 찾은 최대 공약수 대입
                break;
            }
        }
        // 최소 공배수 계산
        for (int k : arr) {
            answer *= (int) (k / min);
        }
        answer *= min;

        System.out.println(answer);
    }
}
