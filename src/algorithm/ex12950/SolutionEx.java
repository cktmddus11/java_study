package algorithm.ex12950;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        int [][] arr1 = {
                {1,2},
                {2,3}
        };
        int [][] arr2 = {
                {3,4},
                {5,6}
        };

        int [][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0;i<arr1.length;i++){
            //int temp[] = new int[arr1[i].length];
            for(int j = 0;j<arr1[i].length;j++){
               // temp[j] = arr1[i][j] + arr2[i][j];
                answer[i][j] =  arr1[i][j] + arr2[i][j];
            }

           //answer[i] = temp;
        }

        for(int i = 0;i<arr1.length;i++){
            System.out.println(Arrays.toString(answer[i]));
        }



    }
}
