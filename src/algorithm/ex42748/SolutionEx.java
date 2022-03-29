package algorithm.ex42748;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/42748
public class SolutionEx {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {1, 7, 3}};
                            // i, j, k
        int[] answer = new int[commands.length];

        for(int i = 0;i<commands.length;i++){
            List<Integer> list = new ArrayList<>();
            int [] temp = commands[i];
            for(int k =temp[0];k<=temp[1];k++) {
                list.add(array[k - 1]);
            }
            Collections.sort(list);
            System.out.println(list);
            answer[i] = list.get(temp[2]-1);

        }

        System.out.println(Arrays.toString(answer));
    }
}
