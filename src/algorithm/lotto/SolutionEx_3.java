package algorithm.lotto;

import java.util.HashMap;
import java.util.Map;
// https://programmers.co.kr/learn/courses/30/lessons/77484
public class SolutionEx_3 {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {44, 1, 5, 2, 33, 26};

        int answer[] = {0, 0};

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos){
            if(lotto == 0){
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }

        System.out.println(map); // {1=true, 25=true, 44=true, 31=true}


        int sameCount = 0;
        for(int winNum : win_nums){
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount); // 4+2 = 6 => 1등
        int minRank = 7 - sameCount; // 7-4 = 3  // 4등등

        System.out.println(maxRank+","+minRank);

        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        System.out.println(maxRank+","+minRank);


        //return new int[] {maxRank, minRank};

    }
}
