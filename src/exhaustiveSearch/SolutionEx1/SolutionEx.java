package exhaustiveSearch.SolutionEx1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SolutionEx {
    public static void main(String[] args){
        int [] answers = {2,1};
        int answer[] = {};

        int people[][] = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        /*int cnt[]=new int [people.length];
        for(int j = 0;j<people.length;j++){ // 사람 반복
            for(int i = 0;i<answers.length;i++){
                if(answers[i] == people[j][i]){
                    cnt[j]++;
                }
            }
        }*/
        int cnt[]=new int [people.length];
        for(int j = 0;j<people.length;j++){
            for(int i = 0;i<answers.length;i++){
                if(people[j][i % people[j].length] == answers[i]){
                    // pattern 의 길이를 넘을경우
                    cnt[j]++;
                }
            }
        }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        //int max = Arrays.stream(cnt).max().getAsInt();
        List<Integer> answerList = new ArrayList<>();


        for(int c = 0;c<cnt.length;c++){
            if(max == cnt[c]){
                answerList.add(c+1);
            }
        }
        System.out.println(Arrays.toString(cnt));
        //answer =answerList.stream().mapToInt(i -> i).sorted().toArray();
        //return list.stream().mapToInt(i->i.intValue()).toArray();
        answer = new int[answerList.size()];  // 성능상 스트림보다는 for문이 더 좋네
        for(int i = 0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        System.out.println(Arrays.toString(answer));




    }
}
