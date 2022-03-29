package algorithm.ex42862;

import java.util.Arrays;

public class SolutionEx4 {
    public static void main(String[] args){
        int n = 5;
        int[] lost = {4,2,1}; // 4에게 3 번이 지급해버리면 5가 할게 없어짐.
        int[] reserve = {3, 5};
        // 댓글에 N+2를 하면 추가 if문을 비교할 필요가 없다는데?
        int []people = new int[n];
        int answer = n;

        for(int l : lost){
            people[l-1]--;
        }
        for(int r : reserve){
            people[r-1]++;
        }
        System.out.println(Arrays.toString(people));
        // [-1, -1, 1, -1, 1]

        for(int i = 0;i<people.length;i++){
            if(people[i] == -1){ // 없는 사람만 줄수 받을 수 있음
                if(i -1 >= 0 && people[i-1] == 1){ // 사람이 맨앞사람이면 더 앞이 없으니까
                    // 0보다 작으면 안됨. && 여벌옷이 있으면 (1)
                    people[i]++;
                    people[i-1]--;
                }else if(i + 1 < people.length && people[i+1]==1){
                    people[i]++;
                    people[i+1]--;
                }else{
                    answer--;
                }
            }
        }

        System.out.println(answer);


    }
}
