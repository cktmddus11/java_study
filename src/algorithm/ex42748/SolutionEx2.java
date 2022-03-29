package algorithm.ex42748;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SolutionEx2 {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        // i, j, k
        int[] answer = new int[commands.length];

        for(int i = 0;i<commands.length;i++){
            Set<Integer> set = new TreeSet();
            int [] temp = commands[i];
            for(int k =temp[0];k<=temp[1];k++) {
                set.add(array[k - 1]);
            }
            System.out.println(set);
            Integer[] arr = set.toArray(new Integer[0]);
            answer[i] = arr[temp[2]-1];
        }

        System.out.println(Arrays.toString(answer));
    }
}
