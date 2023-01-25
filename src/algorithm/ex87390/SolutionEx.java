package algorithm.ex87390;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class SolutionEx {
    public static void main(String[] args){
        int n = 4;
        long left = 7;
        long right = 14;
        int[] answer = {};
        // 1. n�� n�� ũ���� ����ִ� 2���� �迭�� ����
        long temp[][] = new long[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++) {
                //2.  i = 1, 2, 3, ..., n�� ���ؼ�, ���� ������ �ݺ��մϴ�.
                //  1�� 1������ i�� i�������� ���� ���� ��� �� ĭ�� ���� i�� ä��ϴ�.
                temp[j][i] = (long) (i + 1);
                temp[i][j] = (long) (i + 1);
            }
        }
        //3. 1��, 2��, ..., n���� �߶󳻾� ��� �̾���� ���ο� 1���� �迭�� ����ϴ�.
        long concatArr[] = new long[n*n];
        for(int i = 0;i<temp.length;i++){
            //System.out.println(Arrays.toString(temp[i]));
            System.arraycopy(temp[i], 0, concatArr, i*n, temp[i].length);
            System.out.println(Arrays.toString(concatArr));
        }
        // 4. ���ο� 1���� �迭�� arr�̶� �� ��, arr[left], arr[left+1], ..., arr[right]�� ����� �������� ����ϴ�.
        int intArr[] = Arrays.stream(concatArr).mapToInt(i -> (int) i).toArray();
        answer = Arrays.copyOfRange(intArr, Long.valueOf(left).intValue(), Long.valueOf(right+1).intValue());

        System.out.println(Arrays.toString(answer));
    }
}
// https://hianna.tistory.com/601
/*

        src : ������ ���� �迭
        srcPos : ������ ���� �迭�� ���� index�� ������ �� �ֽ��ϴ�.
        (1�� �����ϸ�, �����迭�� index 0���� �����ϰ�, index 1�� ������ ����˴ϴ�.)
        dest : destination array. ���� �迭�� dest �迭�� ����˴ϴ�.
        destPos : dest �迭�� destPos index�� ���� �迭�� ����˴ϴ�.
        length : ���� �迭���� ����� element ����*/
