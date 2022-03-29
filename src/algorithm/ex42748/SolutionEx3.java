package algorithm.ex42748;

import java.util.Arrays;

public class SolutionEx3 {
    public static void main(String[] args){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}, {1, 7, 3}};

        int [] answer = new int[commands.length];

        for(int i = 0;i<commands.length;i++){ // copyOfRange from x -1 , y+1 => x-1 ~ y까지
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            System.out.println(Arrays.toString(temp));
            answer[i] = temp[commands[i][2]-1];
        }
        System.out.println(Arrays.toString(answer));
    }
}
