package algorithm.ex42748;

import java.util.*;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0;i<commands.length;i++){
            List<Integer> list = new ArrayList<>();
            int [] temp = commands[i];
            for(int k =temp[0];k<=temp[1];k++) {
                list.add(array[k - 1]);
            }
            Collections.sort(list);
           // System.out.println(list);
            answer[i] = list.get(temp[2]-1);

        }
        return answer;

        /*for(int i = 0;i<commands.length;i++){
            Set<Integer> set = new TreeSet();
            int [] temp = commands[i];
            for(int k =temp[0];k<=temp[1];k++) {
                set.add(array[k - 1]);
            }
            System.out.println(set);
            Integer[] arr = set.toArray(new Integer[0]);
            answer[i] = arr[temp[2]-1];
        }*/



    }
}
