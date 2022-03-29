package exhaustiveSearch.SolutionEx1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        // 수포자 3명 패턴
        int people[][] = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        // 3명의 수포자가 찍어서 맞춘 횟수 저장할 배열 선언
        int cnt[]=new int [people.length];
        for(int j = 0;j<people.length;j++){
            for(int i = 0;i<answers.length;i++){
                if(people[j][i % people[j].length] == answers[i]){
                    cnt[j]++;
                }
            }
        }
        // 맞춘 횟수의 최대값
        int max = Arrays.stream(cnt).max().getAsInt();
        // 가장 많이 맞춘 사람번호 리스트 담음
        List<Integer> answerList = new ArrayList<>();
        for(int c = 0;c<cnt.length;c++){
            if(max == cnt[c]){
                answerList.add(c+1); // 1번 ~ 3번 이니까 인덱스의 +1
            }
        }
        // 리스트 => array로 변환
        answer =answerList.stream().mapToInt(i -> i).sorted().toArray();

        return answer;
    }
}