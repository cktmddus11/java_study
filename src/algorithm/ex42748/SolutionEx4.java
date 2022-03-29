package algorithm.ex42748;

import java.util.Arrays;

public class SolutionEx4 {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {1, 7, 3}};

        int[] answers = new int[commands.length];

        int n = 0;
        while(n < commands.length){
            int m = commands[n][1] - commands[n][0] + 1;
            //      5  - 2 + 1 = > 4
            if(m == 1){
                answers[n] = array[commands[n++][0] -1];
                continue;
            }
            int [] a = new int[m];
            int j = 0;

            for(int i = commands[n][0]-1;i<commands[n][1];i++){
                a[j++] = array[i];
            }
            sort(a, 0, m-1);

            answers[n] = a[commands[n++][2]-1];

        }


        System.out.println(Arrays.toString(answers));

    }
    private static void sort(int [] a, int left, int right){
        int pl = left; // 0
        int pr = right; // 3

        int x = a[(pl+pr) / 2]; // a[0 + 3 / 2] -> a[1] = 2

        do{
            while(a[pl] < x) pl++; //  5, 2, 6, 3 중 2를 기준으로 2보다 작은 수가 있나?
            while(a[pr] > x) pr --; // 5, 2, 6, 3 중 2를 기준으로 2보다  큰수가 있나?
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);

    }
}
