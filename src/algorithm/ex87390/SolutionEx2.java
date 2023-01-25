package algorithm.ex87390;

import java.util.Arrays;

public class SolutionEx2 {
    public static void main(String[] args){
        int n = 4;
        long left = 7;
        long right = 14;
        int[] answer = new int[(int) (right-left+1)];
        // 1. n행 n열 크기의 비어있는 2차원 배열을 만듭

        long temp1[][] = new long[n][n];
        //int cnt = 0;
      //  long temp[] = new long[(int) (right-left+1)];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++) {
                //2.  i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
                //  1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
                if(i == j && (n* j)+i >= left && (n * j) + i <= right){
                    temp1[j][i] = (long) (i + 1);
                   // temp[cnt] = (long) (i+1);
                    //cnt++;
                }else{
                    if((n* j)+i >= left && (n * j) + i <= right){
                        System.out.println("height : "+(n* j)+i);
                        temp1[j][i] = (long) (i + 1);
                       // temp[cnt] = (long) (i+1);
                      //  cnt++;
                    }
                    if((n* i)+j >= left && (n * i) + j <= right){
                        System.out.println("width : "+((n * i)+j ));
                       // temp[cnt] = (long) (i + 1);
                        temp1[i][j] = (long) (i + 1);
                       // cnt++;
                    }

                }


            }
        }
        //System.out.println(Arrays.toString(temp));
        System.out.println();
        for(int i = 0;i<temp1.length;i++){
            System.out.println(Arrays.toString(temp1[i]));
        }
        int idx = 0;
        for(int i = 0;i<temp1.length;i++){
            for(int j = 0;j<temp1[i].length;j++){
                if(temp1[i][j] != 0){
                    answer[idx] = (int) temp1[i][j];
                    idx++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }
}
