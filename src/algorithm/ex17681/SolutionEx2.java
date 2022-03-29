package algorithm.ex17681;

import java.util.Arrays;

public class SolutionEx2 {
    public static void main(String[] args) {
//        int n = 5;
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};


        int n = 6;
        int[] arr1 = {2, 33, 33, 22, 31, 50};
        int[] arr2 = {2, 56, 19, 14, 14, 10};

        String [] answer = new String[n];
        int[] secretMap = new int[n];

        for(int i = 0;i<n;i++){
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        System.out.println(Arrays.toString(answer));





    }

    private static String makeSharp(int n, int m) {
        if(n == 0){

        }
        return "";
    }
}
