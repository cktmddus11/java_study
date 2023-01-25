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
        // 1. n행 n열 크기의 비어있는 2차원 배열을 만듭
        long temp[][] = new long[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++) {
                //2.  i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
                //  1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
                temp[j][i] = (long) (i + 1);
                temp[i][j] = (long) (i + 1);
            }
        }
        //3. 1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
        long concatArr[] = new long[n*n];
        for(int i = 0;i<temp.length;i++){
            //System.out.println(Arrays.toString(temp[i]));
            System.arraycopy(temp[i], 0, concatArr, i*n, temp[i].length);
            System.out.println(Arrays.toString(concatArr));
        }
        // 4. 새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
        int intArr[] = Arrays.stream(concatArr).mapToInt(i -> (int) i).toArray();
        answer = Arrays.copyOfRange(intArr, Long.valueOf(left).intValue(), Long.valueOf(right+1).intValue());

        System.out.println(Arrays.toString(answer));
    }
}
// https://hianna.tistory.com/601
/*

        src : 복사할 원본 배열
        srcPos : 복사할 원본 배열의 시작 index를 지정할 수 있습니다.
        (1로 지정하면, 원본배열의 index 0값은 제외하고, index 1의 값부터 복사됩니다.)
        dest : destination array. 원본 배열이 dest 배열로 복사됩니다.
        destPos : dest 배열의 destPos index에 원본 배열이 복사됩니다.
        length : 원본 배열에서 복사될 element 갯수*/
