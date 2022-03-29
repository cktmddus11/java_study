package algorithm.ex12935;

import java.util.Arrays;

public class SolutionEx {
    public static void main(String[] args){
        int[] arr = {3,7,1,5};
        int [] answer = {};

        if(arr.length == 1){
            answer = new int[]{-1};
        }
        // 정렬은 하면 안되네 ...순서 달라지니까
        /*Arrays.sort(arr);
        int temp[] = Arrays.copyOfRange(arr,1, arr.length);*/
        int min = arr[0];
        for(int a : arr){
            if(min > a){
                min = a;
            }
        }
        int temp[] = new int[arr.length-1];
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != min){
                temp[j] = arr[i];
                j++;
            }
        }



        answer = temp;
        System.out.println(Arrays.toString(answer));
    }
}
