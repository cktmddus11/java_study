package algorithm.ex12953;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        int[] arr = {3,4,9,16};
        int answer = 1;

        int min = Arrays.stream(arr).min().getAsInt(); // �ִ����� �ʱⰪ ����
        for(int i = min;i>= 1;i--){
            boolean nmgZero = true;
            for (int k : arr) {
                if (k % i != 0) {
                    nmgZero = false;
                    break;
                }
            }
            // �ּҰ����� �迭�� ��� ������ ������ �������� �ִ������� ������
            if(nmgZero) {
                min = i; // ã�� �ִ� ����� ����
                break;
            }
        }
        // �ּ� ����� ���
        for (int k : arr) {
            answer *= (int) (k / min);
        }
        answer *= min;

        System.out.println(answer);
    }
}
